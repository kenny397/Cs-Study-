package calculator;

import java.util.HashMap;

public class CalculatorImpl {
	private static HashMap<String,Calculator> mapping=new HashMap<>();
	
	static {
		mapping.put("+",new PlusCalculator());
		mapping.put("-",new MinusCalculator());
		mapping.put("*",new MultiCalculator());
		mapping.put("/",new DivideCalculator());
	}
	
	public static double calculate(String operate, double result,double number) {
		return mapping.get(operate).operate(result, number);
	}
	
}
