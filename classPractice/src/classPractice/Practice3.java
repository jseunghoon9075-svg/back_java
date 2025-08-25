package classPractice;

class Practice {
	String name;
	int age;
	
	public Practice() {;}

	public Practice(String name, int age) {
		this.name = "고길동";
		this.age = age;
	}
	
	void introduce() {
		System.out.println("제이름은 " +  name + "이고 " + age + "세 입니다.");
	}
	
}

public class Practice3 {
	public static void main(String[] args) {
		Practice stu = new Practice("홍길동", 25);
		stu.introduce();
	}
}
