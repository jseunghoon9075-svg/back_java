package castingTask2;

public class Humun extends Monster {
	public Humun() {;}
	
	@Override
	void diying() {
		System.out.println("해치웠나..?");
	}
	
	@Override
	void drop() {
		System.out.println("휴먼(이)가 골드를 떨어트렸습니다!.");
	}
}
