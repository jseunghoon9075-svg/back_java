package array;

import java.util.Scanner;

public class ArrayTask2 {
	public static void main(String[] args) {
//		      1. 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//		      대문자는 모두 소문자로 변경한다.
//		      입력 예)안녕hI!!
//		      출력 예)안녕Hi!!
//		a = 97 , A = 65
//		사용자에게 입력을 받아야하기때문에 Scanner를 선언하고, 입력받을 메서드도 선언해준다
//		
		Scanner sc = new Scanner(System.in);
		String msg = "입력한 문자 중 소문자는 대문자로 대문자는 소문자로 치환해주는 프로그램\n문자열: ", str = "";
		System.out.print(msg);

//		문자열을 받을거니 문자열 타입의 초기화된 변수를 선언하고, 입력받은 값을 초기화된 변수에 넣어준다
		str = sc.next();
//		문자를 받아 배열을 만들어야하고 길이는 입력받은 값의 문자열 길이만큼 선언해준다
		char[] arr = new char[str.length()];
//		반복문을 사용하고 반복은 배열의 길이만큼 돈다,
//		입력받은 문자를 배열에 넣어준다 입력받은 문자를 반환하는 메서드는 .charAt(); 이걸 이용해서 해결할 수 있다
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
//		반복을 돌려 값을 배열에 넣었다면 소문자는 대문자로 대문자는 소문자로 바꿔야하므로 아스키코드를 이용해 풀 수 있다
//		A = 65, a = 97 이고 한글도 있을 수도있으니 각 조건에 만족하는 조건식을 작성한다
		for (int i = 0; i < arr.length; i++) {
//		만약에 알파벳이 아니고 숫자도 아니라면 그 값은 그냥 넣어준다
			if (arr[i] < str.charAt(i)) {
				arr[i] = str.charAt(i);
//		만약에 배열의 값이 97이상이고 122이하이면 소문자이고 대문자로 바꾸기위해선 -32를 해준다
			} else if (arr[i] >= 97 && arr[i] < 123) {
				arr[i] -= 32;
//		만약에 배열의 값이 65이상이고 90이하이면 대문자이고 소문자로 바꾸기위해선 +32를 해준다
			} else if (arr[i] >= 65 && arr[i] < 91) {
				arr[i] += 32;
			} 
		}
		System.out.println(arr);

//		      2. 정수를 한글로 변경
//		0~9 까지 한글 문자를 배열에 넣고 반복을 돌려서 조건에 맞는 숫자를 한글로 변환 인덱스이용해서 풀어보기
//		인덱스의 번호와 입력한 번호를 비교해서 같으면 빈 변수에 누적하고 출력
//		입력한 정수를 새로운 배열에 할당하고 할당된 인덱스의 값과 한글이 담겨있는 배열의 인덱스번호가 일치하면 
//		해당 한글배열의 인덱스를 추출
//		      입력 예) 1024
//		      출력 예) 일공이사
		char[] arr2 = {'영', '일', '이', '삼', '사', '오', '육', '칠', '팔', '구'};
		int num = 0;
		String str2 = "";
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("정수를 입력하세요 한글로 변환됩니다\n예)1234\n출력)일이삼사");
		
		str2 = sc2.next();
		char[] ch2 = new char[str2.length()];
		
		for(int i = 0; i < str2.length(); i++) {
			ch2[i] = str2.charAt(i);
		}
		
		for(int i = 0; i < str2.length(); i++) {
			
		}
		
		
		
	}
}
