package exceptTest;

public class ExceptTest {
	public static void main(String[] args) {
		
//		alt + shift = z
//		int[] arData = new int[5];
		try {
			
//			arData[5] = ;
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			
			System.out.println("잘못함");
			
		}	catch (Exception e) {
			e.printStackTrace();
		}
	}
}
