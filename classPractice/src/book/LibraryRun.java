package book;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryRun {
	public static void main(String[] args) {
		ArrayList<Book> bList = new ArrayList<Book>();
		
		bList.add(new Book("100", "잃어버린 민준이를 찾아서", "저자 고서준", "도윤 출판사", 8500, "『예준스』, 『르 몽드』 선정 20세기 최고의 책"));
		bList.add(new Book("101", "시우의 자서전", "하준이가 옮김", "빛나는 주원출판사", 8500, "영화배우 민지호가 추천한 젊음에 바치는 영혼의 자서전"));
		bList.add(new Magazine("102", "박지후 과학동아", "편집부 박준우 선생", "준서 사이언스", 8500, "건우의 유튜브에 소개된 과학만화 잡지", 2023,3));
		bList.add(new Book("103", "도현이의 코딩스쿨", "코딩천재 윤현우", "지훈이네 동네", 9900, "제 13회 우진이가 주는 문학상 수상작"));
		bList.add(new Magazine("104", "선우와 서진이의 여행일기", "서울대 이유준 교수", "연우21", 3800, "영화감독 이원종pd가 집필한 영화 전문 잡지", 2023, 4));
		bList.add(new Magazine("105", "민재의 OOTD", "인플루언서 장현준", "은우네 책방", 12000, "핫가이 조정우의 샤라웃을 받은 잡지", 2022,11));
		bList.add(new Book("106", "조시윤의 미라클모닝", "샤이걸 승우찡", "승현 출판사", 6300, "준혁이도 2번이나 성공한 미라클모닝"));
		bList.add(new Book("107", "지환이의 백만가지 요리레시피", "제주도에서 온 윤우", "우리반 출판사", 6300, "제주에서 밥해먹고 사는 일상"));

	}
	
	public static void printBooks(ArrayList<Book> bs) {
		BookController bc = new BookController();
		
		for(Book allbs: bs) {
			System.out.println(allbs);
			bc.addBook(allbs);
		}
		
		boolean flag = true;
		
		while(flag == true) {
			System.out.println("=========================");
			System.out.println("KH 우리반전용 도서관 관리 페이지입니다.");
			System.out.println("1. 조회하기");
			System.out.println("2. 추가하기");
			System.out.println("3. 책 찾기");
			System.out.println("4. 전체책 가격 합계 및 평균 조회");
			System.out.println("5. 프로그램 종료");
			System.out.println("=========================");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("메뉴 번호를 입력해주세요 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
			}
		}
	}
}
