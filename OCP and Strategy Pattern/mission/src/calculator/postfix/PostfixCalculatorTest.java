package calculator.postfix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PostfixCalculatorTest {
	
	
	@Test
	void postfixCalculatetest() {
		System.out.println(PostfixCalculator.postfixCalculator("34+56*+7+"));
		assertEquals(44, PostfixCalculator.postfixCalculator("34+56*+7+"));
	}
	
	

}
