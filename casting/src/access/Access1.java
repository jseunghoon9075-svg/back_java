package access;

public class Access1 {
	int data;
	public int data2;
	protected int data3;
	private int data4;
	
	public Access1() {;}

	public Access1(int data, int data2, int data3, int data4) {
		this.data = data;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
//	getter : 가져오기
	public int getData4() {
		return data4;
	}
//	setter : 수정하기
	public void setData4(int data4) {
		this.data4 = data4;
	}
	
}
