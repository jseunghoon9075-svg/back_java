package array;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 
//		반복문을 이용하여 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//		int[] arr1 = new int[10];
//		int num1 = arr1.length;
//		
//		for(int i = 0; i < arr1.length; i++) {
//			arr1[i] = num1;
//			num1--;
//		}
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.print(arr1[i] + " ");
//		}
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//		ex.양의 정수 : 5
//		    1 2 3 4 5
//		Scanner sc = new Scanner(System.in);
//		System.out.println("양의 정수 : ");
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i + 1;
//			System.out.print(arr[i] + " ");
//		}
//		sc.close();
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 
//		문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//		ex.
//		문자열 : application
//		문자 : i
//		application에 i가 존재하는 위치(인덱스) : 4 8
//		i 개수 : 2
//		String str = "";
//		char ch = ' ';
//		int count = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("문자열 : ");
//		str = sc.nextLine();
//		
//		System.out.print("문자 : ");
//		ch = sc.nextLine().charAt(0);
//		char[] arr = new char[str.length()];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = str.charAt(i);
//		}
//		System.out.print("application에 i가 존재하는 위치(인덱스) : ");
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == ch) {
//				System.out.println(i + " ");
//				count++;
//			}
//		}
//		System.out.println();
//		System.out.println("i의 개수 : " + count);
//		“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 
//		숫자를 입력 받아 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
//		ex.
//		0 ~ 6 사이 숫자 입력 : 4
//		금요일
//		0 ~ 6 사이 숫자 입력 : 7 
//		잘못 입력하셨습니다.
		char[] week = {'월', '화', '수', '목', '금', '토', '일'};
		int num1 = 0, num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		
		num1 = sc.nextInt();
		
			if(num1 >= 0 && num1 < 7) {
				System.out.print(week[num1]+"요일");
			} else
				System.out.println("잘 못 입력하셨습니다\n입력예시)2\n출력예시)수요일");
	}
}
