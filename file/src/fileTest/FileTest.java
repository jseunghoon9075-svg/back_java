package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException, FileNotFoundException{
//		작성 new FileWriter("경로", "이어쓰기 여부");
//		java -> buffer -> 파일															  false로 안바꿈
//			BufferedWriter bufferedWriter =  new BufferedWriter(new FileWriter("test.txt", true));
//			bufferedWriter.write("오늘 야식 뭐먹지!!!~~~~~~");
//			bufferedWriter.close();
			

		BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
		String line = null;
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		
		bufferedReader.close();
	}
}
