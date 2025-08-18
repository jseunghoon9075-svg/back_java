package castingTest;

public class CastingTask4 {
	public static void main(String[] args) {
//      "12.123";
//      "345.789"
//      "6789"
//      3개 값을 더해서 123456789를 출력하기
		String str1 = "12.123", str2 = "345.789", str3 = "6789", result = "";
		double dou1 = 0.0, dou2 = 0.0;
		int num1 = 0, num2 = 0, num3 = 0;

		dou1 = Double.parseDouble(str1);
		dou2 = Double.parseDouble(str2);
		num1 = (int) dou1;
		num2 = (int) dou2;
		num3 = Integer.parseInt(str3);
		str1 = String.valueOf(num1);
		str2 = String.valueOf(num2);
		str3 = String.valueOf(num3);
		result = str1 + str2 + str3;

		System.out.println(result);
	}
}