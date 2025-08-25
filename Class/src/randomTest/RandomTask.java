package randomTest;

import java.util.Random;

//* 로또 번호를 추첨하는 기능
//1. 반복되는 코드를 반복문으로
//2. 메서드로 생성
//3. 6개를 배열로 리턴
//4. 메인 메서드에서 사용 
public class RandomTask {
	
	int[] printLotto() {
		Random random = new Random();
		int[] lottoArr = new int[6];
		for(int i = 0; i < 6; i++) {
			lottoArr[i] = random.nextInt(1,46);
		}
		return lottoArr; 
	}
	
	public static void main(String[] args) {
		RandomTask array = new RandomTask();
		
		int[] arr = array.printLotto();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
