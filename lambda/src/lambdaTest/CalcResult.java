package lambdaTest;

public class CalcResult {
	private int sumResult;
	private int mulResult;
	private int subResult;
	private double divideResult;
	public CalcResult() {;}
	public CalcResult(int sumResult, int mulResult, int subResult, double divideResult) {
		this.sumResult = sumResult;
		this.mulResult = mulResult;
		this.subResult = subResult;
		this.divideResult = divideResult;
	}
	public int getSumResult() {
		return sumResult;
	}
	public void setSumResult(int sumResult) {
		this.sumResult = sumResult;
	}
	public int getMulResult() {
		return mulResult;
	}
	public void setMulResult(int mulResult) {
		this.mulResult = mulResult;
	}
	public int getSubResult() {
		return subResult;
	}
	public void setSubResult(int subResult) {
		this.subResult = subResult;
	}
	public double getDivideResult() {
		return divideResult;
	}
	public void setDivideResult(double divideResult) {
		this.divideResult = divideResult;
	}
	
	
}
