import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTestCase {

	@Test
	public void calculatorShouldPerformPlusOperation(){
		//REFACTORING: Let's start from testing as most important improvement
		//REFACTORING:...and figure out testing procedure for Plus operation:
		MainCalc calc = new MainCalc();
		calc.inputFirstOperand(3.0);
		calc.inputSecondOperand(2.0);
		calc.inputOperation("+");
		assertEquals("Result: a + b = 5.0", calc.execute());
		//REFACTORING: notice that fact of testing force us to think about verbs (methods) of our DSL
	}
	
	//REFACTORING: more tests
	@Test
	public void testPlusWithNegatives(){
		MainCalc calc = new MainCalc();
		calc.inputFirstOperand(3.0);
		calc.inputSecondOperand(-2.0);
		calc.inputOperation("+");
		assertEquals("Result: a + b = 1.0", calc.execute());
	}
	@Test
	public void testMinus(){
		MainCalc calc = new MainCalc();
		calc.inputFirstOperand(77.0);
		calc.inputSecondOperand(22);
		calc.inputOperation("-");
		assertEquals("Result: a - b = 55.0", calc.execute());
	}
	@Test
	public void testMultiply(){
		MainCalc calc = new MainCalc();
		calc.inputFirstOperand(-4);
		calc.inputSecondOperand(3.0);
		calc.inputOperation("*");
		assertEquals("Result: a * b = -12.0", calc.execute());
	}
	@Test
	public void testDivision(){
		MainCalc calc = new MainCalc();
		calc.inputFirstOperand(100.0);
		calc.inputSecondOperand(25.0);
		calc.inputOperation("/");
		assertEquals("Result: a / b = 4.0", calc.execute());
	}
	@Test
	public void testDivisionByZero(){
		MainCalc calc = new MainCalc();
		calc.inputFirstOperand(100.0);
		calc.inputSecondOperand(0);
		calc.inputOperation("/");
		assertEquals("Result: a / b = Infinity", calc.execute());
	}

}
