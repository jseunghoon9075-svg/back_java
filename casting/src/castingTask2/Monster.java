package castingTask2;

public class Monster {
	String name;
	String item;
	int hp;
	
	public Monster() {;}

	public Monster(String name, String item, int hp) {
		this.name = name;
		this.item = item;
		this.hp = hp;
	}
	void diying() {
		System.out.println("처치 되었습니다");
	}
	void drop() {
		
	}
}
