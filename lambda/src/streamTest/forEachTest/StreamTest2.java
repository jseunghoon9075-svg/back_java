package streamTest.forEachTest;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest2 {
	public static void main(String[] args) {
//		ArrayList<Integer> data1 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach((n) -> {data1.add(n);});
//		
//		IntStream.range(0, 5).forEach((n) -> data1.remove(0));
		
//		ArrayList<Integer> data2 = new ArrayList<Integer>();
//		10부터 1까지 추가
//		IntStream.range(0, 10).forEach((n) -> {data2.add(10 - n);});
//		System.out.println(data2);
		
//		ArrayList<String> data3 = new ArrayList<String>();
////		
//		"ABCDEFGHIJK".chars().forEach((n) -> {data3.add(String.valueOf((char)n));});;
//		data3.forEach(System.out::print);
//		ArrayList<String> data4 = new ArrayList<String>();
//      "aBcDeFgHiJk"을 datas4에 소문자만 각각 한 글자씩 추가 후 출력하기
//		97 66 99 68 101 70 103 72 105 74 107 
//		"aBcDeFgHiJk".chars().forEach((n) -> {
//			n % 2 == 0 ? data4.add
//		});
//		data4.forEach(System.out::print);
		ArrayList<String> data5 = new ArrayList<String>();
		"aBcDeFgHiJk".toUpperCase().chars().forEach((n) -> {data5.add(String.valueOf((char)n));});
		data5.forEach((n) -> {System.out.print(n + " ");});
		System.out.println(data5);
	}
}
