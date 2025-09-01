package collection;

import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		System.out.println(datas.size());
		datas.add(10);
		datas.add(20);
		datas.add(40);
		datas.add(30);
		datas.add(50);
		datas.add(60);
		datas.add(10);
		datas.add(90);
		datas.add(80);
		
		System.out.println(datas);
		System.out.println(datas.size());
		System.out.println(datas.get(0));

		
//		실습
//		추가(삽입)
//		50뒤에 500을 삽입
//		수정90을 9로 수정
//		삭제
//		80을 삭제
		if(datas.contains(50))
		
		try {
			datas.add(5, 500);
			datas.set(8, 9);
			datas.remove(9);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 범위에 벗어났습니다");
		} catch(Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
}
