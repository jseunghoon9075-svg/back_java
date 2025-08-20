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
//		char[] week = {'월', '화', '수', '목', '금', '토', '일'};
//		int num1 = 0, num2 = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("0 ~ 6 사이 숫자 입력 : ");
//		
//		num1 = sc.nextInt();
//		
//			if(num1 >= 0 && num1 < 7) {
//				System.out.print(week[num1]+"요일");
//			} else
//				System.out.println("잘 못 입력하셨습니다\n입력예시)2\n출력예시)수요일");
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요. 그리고
//		배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요
//		ex.
//		정수 : 5
//		배열 0번째 인덱스에 넣을 값 : 4
//		배열 1번째 인덱스에 넣을 값 : -4
//		배열 2번째 인덱스에 넣을 값 : 3
//		배열 3번째 인덱스에 넣을 값 : -3
//		배열 4번째 인덱스에 넣을 값 : 2
//		4 -4 3 -3 2
//		총 합 : 2
//		Scanner sc = new Scanner(System.in);
//		int arrSize = 0, count = 0;
//		
//		System.out.println("선언할 배열의 크기 : \nEX) 2 -> 2칸 배열생성");
//		arrSize = sc.nextInt();
//		
//		int[] arr = new int[arrSize];
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i );
//			arr[i] = sc.nextInt();
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print("인덱스 값:" + arr[i] + " ");
//			count += arr[i];
//		}
//		System.out.printf("인덱스값의 총 합 : %d", count);

//		3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,

//		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요. 단, 
//		입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고 다시 정수를 받도록 하세요.
		//
//		ex. 정수 : 4
//		다시 입력하세요.
//		정수 : -6
//		다시 입력하세요.
//		정수 : 5
//		1 2 3 2 1
//		Scanner sc = new Scanner(System.in);
//		int num = 0, count = 0;
//		System.out.println("3이상의 홀수 자연수를 입력하세요 : ");
//		num = sc.nextInt();
//		if ((num >= 3) && (num % 2 == 1)) {
//			int[] arr = new int[num];
//
//			for (int i = 0; i < arr.length; i++) {
//
//				if (i <= arr.length / 2) {
//					count++;
//					arr[i] = count;
//				} else {
//					count--;
//					arr[i] = count;
//				}
//			}
//			for (int i = 0; i < arr.length; i++) {
//				System.out.print(arr[i] + " ");
//			}
//		} else {
//			System.out.println("3이상의 홀수를 입력해주세요");
//		}
//		sc.close();
	}
}
