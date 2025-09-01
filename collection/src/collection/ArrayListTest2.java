package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListTest2 {
	
	public  boolean addArray(ArrayList<Integer> datas, int num) {
		return datas.add(num);
	}
	
	public int setArray(ArrayList<Integer> datas, int index, int value) {
		return datas.set(datas.indexOf(index), value);
	}
	
	public void removeArray(ArrayList<Integer> datas, int value) {
		if(datas.contains(value)) {
			datas.remove(datas.get(datas.indexOf(value)));
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		ArrayListTest2 arrList = new ArrayListTest2();
		arrList.addArray(datas, 300);
		for(int i = 0; i < 2000; i += 100) {
			arrList.addArray(datas, i);
		}
		
		System.out.println(datas);
		System.out.println(datas.size());

		
//		실습
//		추가(삽입)
//		50뒤에 500을 삽입
//		수정90을 9로 수정
//		삭제
//		80을 삭제
//			datas.contains() boolean 타입의 값을 리턴해준다.
		try {
			if(datas.contains(0)) {
//			만약에 50이라는 값이 있다면 true면 
//			.add 값을 넣어주는데(인덱스 , 요소)를 넣어준다 값을 넣어 줄 인덱스 앞의 인덱스에
//				+ 1을 하면 항상 그 인덱스 뒤에 값이 들어가게 된다.
				datas.add(datas.indexOf(0) + 1, 500);
			}
		}catch(IndexOutOfBoundsException e) {
		System.out.println("잘못된 인덱스를 입력하셨습니다!");		
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
		
		arrList.setArray(datas, 1500, 10);
		
		try {
			if(datas.contains(90)) {
//			.set 값을 수정하는데 사용된다. .set(인덱스, 요소) 예외가 발생할 수 있으므로 예외처리를 같이 해주면좋다
				datas.set(datas.indexOf(90), 9);
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("잘못된 인덱스를 입력하셨습니다!");		
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}

		arrList.removeArray(datas, 300);
		if(datas.contains(80)) {
			datas.remove(datas.get(datas.indexOf(80)));
		}
		System.out.println(datas);
		

	}}
