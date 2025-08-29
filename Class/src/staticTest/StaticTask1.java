package staticTest;

class Employee {
	// 필드
	String name;
	int age;
	double income;
	static int money = 0;
//	회사의 돈
//	이름, 나이 ,수익
//	기본 생성자
	public Employee() {;}
//	초기화 생성자
	public Employee(String name, int age, double income) {
		this.name = name;
		this.age = age;
		this.income = income;
		money += this.income;
	}
	void printMoney(Employee[] employee) {
		
		for(Employee p: employee) {
			System.out.println(p.name + incomeExcuted(employee));
			
		}
	}
	
	int incomeExcuted(Employee[] employee) {
		int result = 0;
		for(Employee p: employee) {
			result += p.income;
		}
		return result;
	}
}
//	회사원들이 벌어온 수익을 모두 회사의 돈 에 합치고,
//	회사의 돈 출력
public class StaticTask1 {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Employee[] oner = { 
				new Employee("홍길동", 20, 20000),
				new Employee("고길동", 30, 55_520),
				new Employee("김길동", 25, 15_192)
		};
		employee.printMoney(oner);
	}
}
