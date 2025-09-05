package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask2 {
	public static void main(String[] args) {
//      1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		
//		.mapToInt(): Stream<T> -> IntStream
//		.mapToObj(): IntStream -> Stream<T>
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
		int result = 0;
		result = list.stream().mapToInt(c -> Integer.valueOf(c)).sum();
		System.out.println(result);
		
//      IntStream
      int total = IntStream
         .rangeClosed(1, 6)  //Integer
         .map(n -> n * 10) //IntStream
         .mapToObj(Integer::valueOf) // Stream<Integer>
         .collect(Collectors.toCollection(ArrayList::new)) // ArrayList<Integer>
         .stream() //Stream<Integer>
         .mapToInt(Integer::intValue) // Stream<int>
         .sum(); // int
	}
}
