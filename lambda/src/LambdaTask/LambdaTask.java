package LambdaTask;

import lambdaTest.CalcResult;
import lambdaTest.LambdaInter2;

public class LambdaTask {
//									 주솟값
	public void showCalcResult(CalcResult calcResult) {
		System.out.println(calcResult.getMulResult());
		System.out.println(calcResult.getSumResult());
		System.out.println(calcResult.getSubResult());
		System.out.println(calcResult.getDivideResult());
		
	}
	
	public static void main(String[] args) {
		LambdaInter2 lambdaInter2 = (num1, num2) -> {
			CalcResult mutResult = new CalcResult();
			
			mutResult.setMulResult(num1 * num2);
			mutResult.setSumResult(num1 + num2);
			mutResult.setSubResult(num1 - num2);
			mutResult.setDivideResult(num1 / num2);
			return mutResult;
		
			
		};
		LambdaTask result2 = new LambdaTask();
		CalcResult result = lambdaInter2.calc(10, 20);
		result2.showCalcResult(result);
	}
}
