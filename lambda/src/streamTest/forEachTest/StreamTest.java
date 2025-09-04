package streamTest.forEachTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
//		datas.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
		
		Stream<Integer> newData = datas.stream().map(i -> i * 10).filter(i -> i % 3 == 0 && i > 0);
		List<Integer> listData = newData.toList();
		
		
		System.out.println(listData);
	}
}
