package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
//	.sorted(): 정렬
//		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 24,1 ,4, 21, 5));
		
//		numbers.stream().sorted().forEach(System.out::print);;
//		numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);;
		
		
//	.collect(): 결과를 다양한 타입으로 리턴 --- (Collectors.toCollection(Collection:: )
		ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(1, 24,1 ,4, 21, 5));
//		List<Integer> numbers3 = numbers2.stream().map((n) -> n * 10).collect(Collectors.toList());
		String newString = numbers2.stream().map((n) -> n * 10).map(String::valueOf)
				.collect(Collectors.joining(","));
		
		System.out.println(newString);
		
	}
	
	
}
