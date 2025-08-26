package castingTask2;

import java.util.Scanner;

public class Charactor {
	String nickName;
	int hp;
	String skill;

	public Charactor() {
		;
	}

	public Charactor(String nickName, int hp, String skill) {
		this.nickName = nickName;
		this.hp = hp;
		this.skill = skill;
	}

	String getSkill() {
		return skill = "어퍼슬래쉬!!!!";
	}

	void useSkill() {
		System.out.println("스킬을 사용했습니다 " + this.getSkill());
	}

//	캐릭터가 헌팅메서드를 사용하면 각 몬스터들이 아이템과 비명을지름
	void hunting(Monster monster) {
		Scanner sc = new Scanner(System.in);
		String choice = "";
		System.out.println("처치 할 몬스터를 선택하세요\n1.오크 2.요정, 3.휴먼");
		choice = sc.next();

		if (choice.equals("1")) {

			if (monster instanceof Oak) {
				Oak oak = (Oak) monster;
				nickName = "홍길동";
				this.hp = 100;

				if (oak.skill(false)) {
					oak.skill(oak.skill);
					System.out.println(nickName + "의 " + this.hp + "Hp 가 20 감소했습니다!!!");
					
				} else {
					this.useSkill();
					monster.diying();
					monster.drop();
				}
			} else if (choice.equals("2")) {
				if (monster instanceof Faerie) {
					monster.diying();
					monster.drop();
				} else if (monster instanceof Humun) {
					monster.diying();
					monster.drop();
				}
			}
		}
	}
}
