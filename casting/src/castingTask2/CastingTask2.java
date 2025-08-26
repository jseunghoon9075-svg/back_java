package castingTask2;


//캐릭터 클래스
//사냥 메서드

//각각 가지고 있는 아이템을 드랍
//오크 클래스 - 도끼
//콜록!을 출력하는 메서드

//요정 클래스 - 팬던트
//ㄱr끔 눈물을 흘린다...는 기능을 가진 메서드

//휴먼 클래스 - 골드
//해치웠나..?를 출력하는 기능 메서드

//초기화블록 응용

public class CastingTask2 {
	public static void main(String[] args) {
		new Charactor().hunting(new Oak());
		new Charactor().hunting(new Humun());
		new Charactor().hunting(new Faerie());
	}
}
