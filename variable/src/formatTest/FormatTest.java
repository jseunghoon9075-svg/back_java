package formatTest;

public class FormatTest {
	public static void main(String[] args) {
		String name = "승훈";
		int age = 20;
		double height = 188;
		
		System.out.printf("저의 이름은 %s입니다", name);
		System.out.printf("저의 이름은 %s이고, 나이는 %d, 키는 %.1fcm입니다.", name, age, height);
		
	}
}
