package castingTask2;

public class Faerie extends Monster {
	public Faerie() {;}
	
	@Override
	void diying() {
		System.out.println("ㄱr끔 눈물을 흘린다...");
	}
	
	@Override
	void drop() {
		System.out.println("요정(이)가 팬던트를 떨어트렸습니다!.");
	}
}
