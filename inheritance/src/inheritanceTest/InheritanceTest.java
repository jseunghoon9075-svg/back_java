package inheritanceTest;
//	상속 : 결국은 추상화 1번밖에 쓸 수 없다. 반복되는 코드를 줄이고, 기존에 있는 값에다가 플러스알파로 추가해주는것
//	자식 : 자식호출은 부모를 먼저 호출해줘야함.

//	부모 클래스
class A {
	String name;
	int data;
	
	public A() {
		System.out.println(this);
		System.out.println("부모 생성자 호출");
		this.name = "A";
		this.data = 10;
	}
	
	void printName() {
		System.out.println(name);
	}
	
	void walk() {
		System.out.println("네 발로걷기");
	}
};

//	자식 클래스
class B extends A{
	public B() {
//		super() : 부모 생성자 호출 키워드
		super();
		System.out.println(this);
		System.out.println("자식 생성자 호출됨");
	}
	
	void printData() {
		System.out.println(data);
	}
	
	@Override // 어노테이션
	void walk() {
		System.out.println("두 발로 걷기");
	}
};



public class InheritanceTest {
	public static void main(String[] args) {
		B b = new B();
		b.printName();
		b.printData();
		b.walk();
		
	}
}
