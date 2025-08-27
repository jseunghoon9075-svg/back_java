package abstractTest;

public abstract class Electronics {
	
//	추상 메서드
	public abstract void safe();
//	일반 메서드
	public void on() {
		System.err.println("일반 메서드");
	}
}
