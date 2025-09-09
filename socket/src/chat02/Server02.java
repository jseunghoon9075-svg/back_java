package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server02 {
	public static void main(String[] args) {
//		서버소켓
		ServerSocket serverSocket = null;
//		클라이언트 소켓
		Socket socket = null;
//		데이터 수신을 읽어줄 객체
		BufferedReader in = null;
//		데이터 송신을 해줄 객체
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
		try {
//			서버소켓을 생성자를통해 객체화.       해당port번호로 서버가동
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다. 연결 대기중....");
//			가동중인 서버에 클라이언트가 들어오면 낚아채줄 .accept() 메서드
			socket = serverSocket.accept();
			System.out.println("연결되었습니다.");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String inMessage = in.readLine();
				System.out.println("클라이언트 > " + inMessage);
				
				System.out.println("서버에서 클라이언트로 메세지 전송 >");
				String outMessage = sc.nextLine();
				out.write(outMessage + "\n");
//				flush : buffer 비워주는 키워드
				out.flush();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serverSocket != null) {
					serverSocket.close();
				}
				if(socket != null) {
					socket.close();
				}
				if(in != null) {
					in.close();
				}
				if(out != null) {
					out.close();
				}
				if(sc != null) {
					sc.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
