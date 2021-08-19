package calculator;

import java.util.HashMap;

public class CalculatorImpl {
	private static HashMap<String,Calculator> mapping=new HashMap<>();
	
	static {
		mapping.put("+",(result,number)-> result+number);
		mapping.put("-",(result,number)-> result-number);
		mapping.put("*",(result,number)-> result*number);
		mapping.put("/",(result,number)-> result/number);
	}
	
	public static double calculate(String operate, double result,double number) {
		return mapping.get(operate).operate(result, number);
	}
	
}
