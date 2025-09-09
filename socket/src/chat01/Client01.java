package chat01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client01 {
	public static void main(String[] args) {
//		서버의 ip와 port번호가 필요하다
//		port : 1100
//		192.168.161.16 -> 내가 쓰고있는 ip번호
		Socket socket = null;
		PrintWriter writer = null;
		String message = null;
		
		String serverIp = "192.168.161.16";
		try {
			socket = new Socket(serverIp, 1100);
			System.out.println("서버에 연결 되었습니다.");
			writer = new PrintWriter(socket.getOutputStream(), true);
			message = "안녕! 나는 최준서야! 나에게 무서운건 없지!";
			writer.println(message);
			System.out.println("서버로 [" + message + "]를 전송했습니다.");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
//			외부장치에 연결하는 코드는 항상 finally코드로 리소스 해제를 해줘야함
		} finally {
			try {
				if(writer != null) {
					writer.close();
				}
				if(socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
