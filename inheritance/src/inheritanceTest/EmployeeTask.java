package inheritanceTest;
//EmployeeTask
//비상금
//각 메서드 출력
//work 하루 종일 일을 한다
//sleep 잠을 설친다
//eat 야식을 먹는다
//
public class EmployeeTask extends PersonTask{
	int money;
	public EmployeeTask(int money, String name, int age, String address, String phone) {
		super(name, age, address, phone);
	}
	
	@Override
	void work() {
		System.out.println("하루 종일 일을 합니다.");
	}
	@Override
	void sleep() {
		System.out.println("잠을 설칩니다.");
	}
	@Override
	void eat() {
		System.out.println("야식을 먹습니다.");
	}
}
