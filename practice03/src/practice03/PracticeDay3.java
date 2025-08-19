package practice03;

public class PracticeDay3 {
	public static void main(String[] args) {
//		1부터 100까지 짝수 총합 구하기
//		int sum = 0;
//		for(int i = 0; i < 100; i++) {
//			int value = i + 1;
//			if(value % 2 == 0) {
//				sum += value;
//			}
//		}
//		System.out.printf("1부터 100까지 짝수 합:%d", sum);
//		1부터 100까지 홀수 개수구하기
//		int count = 0;
//		for(int i = 0; i < 100; i++) {
//			int value = i + 1;
//			if(value % 2 == 1) {
//				count++;
//			}
//		}
//		System.out.printf("1부터 100까지 홀수 총개수:%d", count);
//		10부터 1까지 반복수행 반복시 5까지만 출력하고 중단
//		for(int i = 0; i < 10; i++) {
//			if(i == 6) {
//				break;
//			}
//			System.out.println(10 - i);
//		}
//		1부터 100까지 3의 배수의 개수를 출력하기
//		int count = 0;
//		for(int i = 0; i < 100; i++) {
//			if((i + 1) % 3 == 0) {
//				count++;
//			}
//		}
//		System.out.println(count);
//		int count = 0;
//		for(int i = 2; i < 10; i++) {
//			
//			for(int j = 1; j < 10; j++) {
//				System.out.println(i + "X" + j + "=" + (i * j) + "\t");
//				
//			}
//		}
//		A부터 Z 까지 알파벳 출력
//		char total = 0;
//		int aski = 65;
//		for(int i = 0; i < 26; i++) {
//			total = (char)aski;
//			System.out.println((char)(total + i));
//		}
//		int count = 65;
//		for(int i = 0; i < 26; i++) {
//			System.out.println((char)count++);
//		}
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print(" ");
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
