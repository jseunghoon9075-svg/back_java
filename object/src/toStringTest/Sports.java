package toStringTest;

public class Sports {
	private String type;
	private int total;
	
	public Sports() {;}

	public Sports(String type, int total) {
		this.type = type;
		this.total = total;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
//	Object
//	private
//	기본생성자
//	초기화 생성자
//	getter, setter
//	toString << 반드시 재정의해서 써야함
	
	
	@Override
	public String toString() {
		return "Sports [type=" + type + ", total=" + total + "]";
	}

	
	public static void main(String[] args) {
		Sports sports = new Sports();
		sports.setTotal(5);
		sports.setType("뭘 넣어도되나");
		System.out.println(sports);
		
	}
}