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
		
		Socket socket = null;
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost", 7777);
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				System.out.println("클라이언트에서 서버로 >");
				String outMessage = sc.nextLine();
				out.write(outMessage + "\n");
				out.flush();
				
				String inMessage = in.readLine();
				System.out.println("서버에서 클라이언트 >" + inMessage);
				
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
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
