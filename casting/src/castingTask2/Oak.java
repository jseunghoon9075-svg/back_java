package castingTask2;

public class Oak extends Monster {
	String skill;
	public Oak() {;}
	
	
	public Oak(String name, String item, int hp, String skill ) {
		super(name, item, hp);
		this.skill = skill;
	}
	
	String getName() {
		return name = "오크";
	}
	int getHp() {
		return hp = 100;
	}
	String getSkill() {
		return skill = "회전베기";
	}

	@Override
	void diying() {
		System.out.println("콜록!");
	}
	@Override
	void drop() {
		System.out.println("오크(이)가 도끼를 떨어트렸습니다!.");
	}
	void skill(String skill) {
		System.out.println(this.getName() + "가 회전베기를 시전했습니다!");
	}
	boolean skill(boolean skill) {
		return skill;
	}
}
