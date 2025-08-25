package inheritanceTest;

class Car {
	String brand;
	String color;
	int price;
	
	public Car() {;}

	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println("시동 켜짐");
	}
	
	void engineStop() {
		System.out.println("시동 꺼짐");
	}
	
}

class SuperCar extends Car{
	String mode;
	
	public SuperCar() {;}
	
	public SuperCar(String mode, String brand, String color, int price) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
		System.out.println("음성인식 시동켜짐");
	}
	
	@Override
	void engineStop() {
		System.out.println("음성인식 시동꺼짐");
	}
	
	
}

public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar superCar = new SuperCar();
		Car matiz = new Car();
		
		matiz.engineStart();
	}
}
