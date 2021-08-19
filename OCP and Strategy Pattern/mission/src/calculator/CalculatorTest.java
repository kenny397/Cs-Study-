package calculator;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;



class CalculatorTest {
	TextCalculator cal;
	
	@Before
	void setting() {
		cal=new TextCalculator();
	}

	@Test
	void plustest() {
		Assert.assertEquals(0,Double.compare(3.0, cal.calculate("1 + 2")));
		
	}
	@Test
	void minustest() {
		assertEquals(0,Double.compare(-1.0, cal.calculate("1 - 2")));
	}
	@Test
	void multitest() {
		assertEquals(0,Double.compare(2.0, cal.calculate("1 * 2")));
	}
	@Test
	void dividetest() {
		assertEquals(0,Double.compare(0.5, cal.calculate("1 / 2")));
	}
	
	
	
	
	

}
