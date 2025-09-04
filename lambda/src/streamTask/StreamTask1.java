package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//      7. 한글을 정수로 변경 "공칠이삼" -> 0723
//      8. 정수를 한글로 변경 0723 -> "공칠이삼"

public class StreamTask1 {
	public static void main(String[] args) {
//      요구사항
//      모두 stream문법으로 사용한다.

//      1. 1~10까지 ArrayList에 담고 출력
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(l -> list.add(l));
//		System.out.println(list);
		
//      2. ABCDEF를 각각 문자별로 출력
//		"ABCDEF".chars().forEach((s) -> System.out.print((char)s + " "));
		
//      3. 1~100까지 중 홀수만 ArrayList에 담고 출력
//		IntStream.rangeClosed(1, 100).forEach(n -> list.add(n));
//		ArrayList<Integer> newList = list.stream().filter(n -> n % 2 == 1).collect(Collectors.toCollection(ArrayList::new));
//		System.out.println(newList);
		
//      4. A~F까지 중 D를 제외하고 ArrayList에 담고 출력
//		A B C D E F
//		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		"ABCDEF".chars().filter(c -> c != 68 ).forEach(c -> list2.add(c));
//		list2.stream().forEach(c -> System.out.println((char)(int)c));
		
//      5. 5개의 문자열을 모두 소문자로 변경 후 출력
//      "Black", "WHITE", "reD", "yeLLow", "PInk"
//		ArrayList<String> str = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PInk"));
//		str.stream().forEach(d -> System.out.println(d.toLowerCase()));
		
//      6. "Apple", "banana", "Melon", "orange" 중 앞글자가 대문자인 문자열만 출력
		ArrayList<String> str2 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "orange"));
		
		str2.stream().map(())
		
		
	}
}
