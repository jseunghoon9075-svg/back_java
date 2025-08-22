package classPractice;

//class Speaker {
//	int volume;
//	
//	public Speaker() {;}
//	void turnOn() {
//		volume = 50;
//		System.out.println("스피커의 전원이 켜졌습니다. 기본 볼륨은" + volume + "입니다.");
//	}
//}
//class Person {
//	void printHello() {
//		System.out.println("Hello");
//	}
//}

class Student {
	void introduce(String name) {
		System.out.println("안녕하세요, 제 이름은" + name + "입니다.");
	}
}
public class Practice1 {
	public static void main(String[] args) {
//		Speaker speaker = new Speaker();
//		speaker.turnOn();
		
//		Person p = new Person();
//		for(int i = 0; i < 3; i++) {
//			p.printHello();
//		}
		Student student1 = new Student();
		Student student2 = new Student();
		student1.introduce("철수");
		student2.introduce("영희");
	}
}
