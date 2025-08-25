package inheritanceTest;



//InhertanceTask에서
//사람, 학생, 직장인 객체화 후 각 메서드 출력하기
public class InheritanceTask2 extends PersonTask{
	public InheritanceTask2(String name, int age, String address, String phone) {
		super(name, age, address, phone);
	}
	public static void main(String[] args) {
		StudentTask student = new StudentTask("kildong_00", "홍길동", 25, "강남구", "010-1234-5678");
		System.out.printf("인스타:%s\n이름:%s\n나이:%d\n거주지:%s\n핸드폰번호:%s\n"
				+ "",student.instaId,student.name,student.age,student.address,student.phone);
		student.work();
		student.sleep();
		student.eat();
		System.out.println();
		
		PersonTask person = new PersonTask("고길동", 25, "성북구", "010-1111-2222");
		System.out.println(person.name);
		person.work();
		person.sleep();
		person.eat();
		System.out.println();
		
		EmployeeTask employee = new EmployeeTask(100_000, "김길동", 20, "인천", "010-3333-4444");
		System.out.println(employee.name);
		employee.work();
		employee.sleep();
		employee.eat();
	}
	

}
