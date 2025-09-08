package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileTask {
	
	public void writeAndAppendText(BufferedWriter writer, String[] foods) throws IOException{
		for(String food : foods) {
			writer.write(food + "\n");
		}
		writer.close();
	}
	
	public void writeAndAppendText(BufferedWriter writer, String foods) throws IOException{
		
		writer.write(foods + "\n");
		
		writer.close();
	}
	
	public void printTextFile(BufferedReader reader) throws IOException{
		String line = null;
		while((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();
	}
	
	public static void main(String[] args) throws IOException, FileNotFoundException{
		FileTask file = new FileTask();
		String[] foods = {"리조또", "봉골레파스타", "피자", "스테이크"};
		
//		음식 4개 작성하기 -> foods.txt
//		음식 1개당 1줄씩 사용
		
		BufferedWriter foodWriter = new BufferedWriter(new FileWriter("foods.txt", false));
		
//		file.writeAndAppendText(foodWriter, foods);
//		
//		foods.txt
//		음식을 모두 가져왓 콘솔에 출력
//		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("foods.txt"));
//		
		file.printTextFile(bufferedReader);
		
//		값 수정
//		알리오올리오 파스타로 변경
		
//		값 삭제
		
		String line = null, temp = "";
		
		while((line = bufferedReader.readLine()) != null) {
			temp += line;
		}
		
	}
}
