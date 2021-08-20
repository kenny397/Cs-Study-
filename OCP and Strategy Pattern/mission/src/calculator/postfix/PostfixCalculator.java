package calculator.postfix;

import java.util.Stack;

public class PostfixCalculator {
	
	static int postfixCalculator(String postfix) {
		Stack<Integer> st= new Stack<>();
		for(int i=0; i<postfix.length(); i++) {
			if(postfix.charAt(i)<='9'&&postfix.charAt(i)>='0') {
				st.add(postfix.charAt(i)-'0');
			}else {
				CalculatorImpl.caculate(postfix.charAt(i), st);
			}
		}
		return st.pop();
	}
}
