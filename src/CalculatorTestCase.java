import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTestCase {

	@Test
	public void calculatorShouldPerformPlusOperation(){
		MainCalc calc = new MainCalc();
		calc.inputFirstOperand(3.0);
		calc.inputSecondOperand(2.0);
		calc.inputOperation("+");
		assertEquals("Result: 3.0 + 2.0 = 5.0", calc.execute());
	}
	
	//REFACTORING: more tests
	@Test
	public void testPlusWithNegatives(){
		MainCalc calc = new MainCalc();
		calc.inputFirstOperand(3.0);
		calc.inputSecondOperand(-2.0);
		calc.inputOperation("+");
		assertEquals("Result: 3.0 + -2.0 = 1.0", calc.execute());
	}
	@Test
	public void testMinus(){
		MainCalc calc = new MainCalc();
		calc.inputFirstOperand(77.0);
		calc.inputSecondOperand(22);
		calc.inputOperation("-");
		assertEquals("Result: 77.0 - 22.0 = 55.0", calc.execute());
	}
	@Test
	public void testMultiply(){
		MainCalc calc = new MainCalc();
		calc.inputFirstOperand(-4);
		calc.inputSecondOperand(3.0);
		calc.inputOperation("*");
		assertEquals("Result: -4.0 * 3.0 = -12.0", calc.execute());
	}
	@Test
	public void testDivision(){
		MainCalc calc = new MainCalc();
		calc.inputFirstOperand(100.0);
		calc.inputSecondOperand(25.0);
		calc.inputOperation("/");
		assertEquals("Result: 100.0 / 25.0 = 4.0", calc.execute());
	}
	@Test
	public void testDivisionByZero(){
		MainCalc calc = new MainCalc();
		calc.inputFirstOperand(100.0);
		calc.inputSecondOperand(0);
		calc.inputOperation("/");
		assertEquals("Result: 100.0 / 0.0 = Infinity", calc.execute());
	}

}
