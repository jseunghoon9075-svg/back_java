package classPractice;

class Person{
	int age;
	
	public Person() {;}

	public Person(int age) {
		this.age = age;
	}
	
	void setAge(int num) {
		
		if(num <= 0) {
			System.out.println("1이상의 숫자를 입력하세요");
			return;
		} else
			age = num;
	}
	int getAge() {
		return age;
	}
}

public class PracticeSetGet5 {
	public static void main(String[] args) {
		Person p = new Person(0);
		p.setAge(-3);
		p.setAge(30);
		System.out.println("p의 나이는" + p.getAge() + "입니다.");
		
	}
}
