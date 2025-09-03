package collectionTest;
	class Apple {}
	class Banana {}

public class GenericPractice<T> {
	private T[] fruit;

	public GenericPractice(T[] fruit) {
		this.fruit = fruit;
	}

	public T getFruit(int index) {
		return fruit[index];
	}

	public void setFruit(T[] fruit) {
		this.fruit = fruit;
	}
	
	public static void main(String[] args) {
		Apple[] arr = {
				new Apple(),
				new Apple()
		};
		
		GenericPractice<Apple> list = new GenericPractice<>(arr);
		
		Apple apple = (Apple) list.getFruit(0);
		
		System.out.println();
	}
}
