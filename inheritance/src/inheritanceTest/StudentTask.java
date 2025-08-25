package inheritanceTest;
//StudentTask
//인스타아이디
//각 메서드 출력
//work 아르바이트를 한다
//sleep 수업 시간에 잠을 잔다
//eat 아침을 거른다
//
public class StudentTask extends PersonTask{
	String instaId;
	public StudentTask(String instaId, String name, int age, String address, String phone ) {
		super(name, age, address, phone);
		this.instaId = instaId;
	}
	
	@Override
	void work() {
		System.out.println("아르바이트를 합니다.");
	}
	@Override
	void sleep() {
		System.out.println("수업 시간에 잠을 잡니다.");
	}
	@Override
	void eat() {
		System.out.println("아침을 거릅니다.");
	}

}
