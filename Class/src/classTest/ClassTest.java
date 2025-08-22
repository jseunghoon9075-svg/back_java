package classTest;

//	추상화
public class ClassTest {
//	필드, 멤버, 필변
	String name;
	int age;

//   기본 생성자
	public ClassTest() {
		;
	}

//   초기화 생성자
	public ClassTest(String name, int age) {
//		자기 자신의 주소값(this)
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
//		 객체화
		ClassTest ct1 = new ClassTest("홍길동", 20);
		ClassTest ct2 = new ClassTest("김길동", 20);
		ClassTest ct3 = new ClassTest();
		System.out.println(ct1.name);
		System.out.println(ct2.name);
	}
}
