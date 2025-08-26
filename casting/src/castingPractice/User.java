package castingPractice;
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
public class User {
	String name;
	String phone;
	int money;
	int point;
	int discount;
	

	public User() {;}

	public User(String name, String phone, int money, int point, int discount) {
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.point = point;
		this.discount = discount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
}
