package calculator;

public class TestCalculator {
	public static double calculate(String inputText) {
		String[] tokens = inputText.trim().split(" ");
		double result = Double.parseDouble(tokens[0]);
		for (int i = 1; i < tokens.length; i += 2) {
			String operate = tokens[i];
			double number = Double.parseDouble(tokens[i + 1]);
			result = CalculatorImpl.calculate(operate, result, number);
		}

		return result;
	}

	
}
