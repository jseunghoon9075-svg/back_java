package array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
//		int[][] arr = new int[3][5];
//		
//		int count = 1;
//		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 5; j++) {
//				arr[i][j] = count++;
//			}
//		}
//		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print(arr[i][j] + "");
//			}
//			System.out.println();
//		}
//		주민등록번호 성별자리 이후부터 *로 가리고 출력하세요. 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
//
//		ex.
//		주민등록번호(-포함) : 123456-1234567
//		123456-1******
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함)14자리 : ");
		String num = sc.nextLine();
		
		char[] arr = new char[14];
		
		for(int i = 0; i < num.length(); i++) {
			arr[i] = num.charAt(i);
		}
		char[] arrClone = arr.clone();
		
		for(int j = 7; j < arrClone.length; j++) {
			arrClone[j] = '*';
			System.out.print(arrClone);
		}
		
	}
}
