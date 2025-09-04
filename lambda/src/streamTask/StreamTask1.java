package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

//      

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
//		리스트를 순차적으로 돌면서 .charAt(0) 번째의 문자가 65~92 사이인것만 출력
		ArrayList<String> str2 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "orange"));
		str2.stream().filter(d -> d.charAt(0) >= 65 && d.charAt(0) <= 92).forEach(d -> System.out.println(d));

//      7. 한글을 정수로 변경 "공칠이삼" -> 0723
		HashMap<String, Integer> han = new HashMap<String, Integer>();
		han.put("공", 0);
		han.put("일", 1);
		han.put("이", 2);
		han.put("삼", 3);
		han.put("사", 4);
		han.put("오", 5);
		han.put("육", 6);
		han.put("칠", 7);
		han.put("팔", 8);
		han.put("구", 9);
//		"공칠이삼".chars().mapToObj(c -> String.valueOf((char)c)).map(han::get).forEach(System.out::print);
		
//		8. 정수를 한글로 변경 0723 -> "공칠이삼"
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(0, 7, 2, 3));
		num.stream().mapToInt(c -> ((char)(int)c)).map(c -> num.get(c)).forEach(System.out::print);
	}
}
