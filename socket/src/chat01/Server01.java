package chat01;
//	osi 7계층 
//	서비스의 로직들을 7계층으로 구분한것
//																	socket
//	물리계층 - 컴퓨터(하드웨어) -> 데이터링크계층 -> 네트워크(ip)계층 -> 전송계층 TCP) <--> 세션계층 -> 표현 계층 -> 응용계층
//	socket은 양방향스트림 이다
//	bind - socket들을 묶는것
//	통신 연결 요청을 받아들이는 socket을 server socket이라고 한다.
//	통신 연결 요청을 보내는 socket을 client socket이라고 한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) {
//		서버 소켓											
		ServerSocket serverSocket = null;
//		클라이언트 소켓
		Socket socket = null;
//		데이터 가져오기 - 사용자의 입력 스트림을 읽기 위한 BufferedReader
		BufferedReader reader = null;
		
		String message = null;
		
		try {
//										port번호
			serverSocket = new ServerSocket(1100);
//			서버가동
			System.out.println("서버 시작, 클라이언트 대기");
//								.accept() : 서버쪽에 요청이들어오면 낚아챔(bind를 해주는것과 동일)
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결");
			
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			message = reader.readLine();
			System.out.println("클라이언트로부터 받은 메세지:");
			System.out.println(message);
//			여기가 끝 단방향 웹소켓 서버쪽 연결끝
			
			
		} catch (IOException e) {
			e.printStackTrace();
//			서버와 통신했을때 오류가 발생할 수 있고 발생하더라도 서버를 닫아줘야하기떄문에 finally 키워드를 사용해서 서버를 닫아줘야한다
//			finally 키워드도 예외처리를 강제하기떄문에 try catch로 감싸준다
		} finally {
			try {
//				리소스 해제
				if(serverSocket != null) {
					serverSocket.close();
				}
				if(socket != null) {
					socket.close();
				}
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
