package synchronizedTest;

public class KB {
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread parant = new Thread(atm, "엄마");
		Thread child = new Thread(atm, "자식");
		
		parant.start();
		child.start();
		
	}
}
