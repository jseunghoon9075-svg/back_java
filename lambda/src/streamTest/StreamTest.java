package streamTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
//		
		ArrayList<Integer> datas = new ArrayList<Integer>();
//		.range(시작, 끝) : 마지막을 포함하지않는다.
//		.rangeClosed : 마지막을 포함한다.
		IntStream.rangeClosed(0, 10).forEach((n) -> {
			datas.add(n);
		});

//		참조형 문법
//		.(소속::메서드명)
//		ex) .(System.out::print)
//		IntStream.rangeClosed(1, 5).forEach((n) -> {
//			datas.add(n);
//		});
//		
//		.StreamTest(): 컬렉션을 Stream 객체로 변경
//		.chars(): 문자열을 Stream 객체로 변경		
		datas.forEach((b) -> {
			System.out.println(b);
			
		});
	}
}
