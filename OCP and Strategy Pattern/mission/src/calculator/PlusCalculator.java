package calculator;

public class PlusCalculator implements Calculator {

	@Override
	public double operate(double result, double number) {
		return result+number;
	}
	
}
