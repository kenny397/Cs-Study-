package calculator.postfix;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CalculatorImpl {
	static HashMap<Character, Calculator> mapping =new HashMap<>();
	
	static {
		mapping.put('*', st->{st.add(st.pop()*st.pop());});
		mapping.put('+', st->{st.add(st.pop()+st.pop());});
	}
	
	static void caculate(char operate,Stack<Integer> st) {
		CalculatorImpl.mapping.get(operate).calculate(st);
		
	}
}
