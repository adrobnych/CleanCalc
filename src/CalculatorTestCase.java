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

}
