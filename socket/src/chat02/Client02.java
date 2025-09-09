package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client02 {
	public static void main(String[] args) {
//		클라이언트 소켓
		Socket socket = null;
//		서버쪽 데이터를 읽어줄 객체
		BufferedReader in = null;
//		서버쪽으로 데이터를 보내줄 객체
		BufferedWriter out = null;
//		실행
		Scanner sc = new Scanner(System.in);
		
//		"localhost" - 내 컴퓨터에서만 가동
		try {
//	생성자는 try catch를 강제하기떄문에 감싸준다 -"Ip", port번호
			socket = new Socket("localhost", 7777);
			
//			데이터를 읽어줄 객체를 생성자를 통해 생성해주고 소켓의 인풋스트림을 가져온다
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			데이터를 보내줄 객체를 생성자를 통해 생성해주고 소켓의 아웃풋스트림을 가져온다
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
//			사용자가 얼마나,언제까지 데이터를 보낼 지 모르고 서버에서 얼마나 올지도 모르기때문에 while문 작성
			while(true) {
//				데이터 전송이 잘 이루어졌는지 확인용 출력
				System.out.println("클라이언트에서 서버로 >>");
//			 	클라이언트쪽 서버 실행
				String outMessage = sc.nextLine();
				
//				입력한 문자를 기행문자를 붙혀서 보내준다
				out.write(outMessage + "\n");
//				버퍼를 비워준다
				out.flush();
//				서버쪽에서 데이터를 읽어옴
				String inMessage = in.readLine();
//				데이터 수신이 잘 이루어졌는지 확인용 출력
				System.out.println("서버 >>" + inMessage);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
//			finally는 만약 서버와 통신했을 때 오류가 발생할 수 있고 오류가 발생이된다면 서버 전체를 닫아줘야한다 
//			안그러면 오류는 발생되어있는 상태로 해당 포트는 작동하고 있기때문에 해당 포트를 더 이상 사용할 수 없게된다,
//			고로 외부장치에 연결하는 코드는 항상 finally를 사용해 리소스 해제를 해준다
//			finally키워드도 예외처리를 강제하기때문에 try catch로 예외처리를 해준다
		} finally {
			try {
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
