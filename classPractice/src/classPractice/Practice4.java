package classPractice;

public class Practice4 {
//	반환값이 없는 메서드 선언
//	정수 배열을 매개변수로 받고
//	result 라는 초기화된 변수선언
//	매개변수의 값을 받고 그 길이만큼 반복을 돌려
//	값의 합을 result 에 누적합
	void sum(int[] nums) {
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			result += nums[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
//		매개변수로 넘겨줄 배열생성
		int nums[] = {2, 5, 10, 2, 3, 5};
//		객체생성
		Practice4 p = new Practice4();
//		메서드를 호출하고 매개변수로 생성한 배열을 넘김
		p.sum(nums);
	}
}
