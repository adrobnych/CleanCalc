//SMELL: No package

import java.util.Scanner;

//SMELL: MainCalc is very bad word from perspective of DSL for the task. 
//SMELL: Is it main calculator from set of others? 
//SMELL: Calc is not the best name for calculator.
//SMELL: Actually name made from perspective of temporary solution binded to main() method.

//SMELL: This class has O cohesion. 
//SMELL: Because no instance variables used across many methods.
//SMELL: This class has no OOD sense.

//SMELL: The solution is highly coupled with Console type application.

//SMELL: This solution is not friendly for tests.

//SMELL: No tests.


public class MainCalc {

//SMELL: main method expected to be a thin runner of ready-to-use set of objects  
	public static void main(String[] args) {		

//SMELL: Which intent here? Our calculator can establish emotional relation to its user?
//SMELL: Is it expected from user to say "Hello from user"? 
		
//SMELL: Anyway lets mark the additional responsibility of main method to say hello to user. 
		System.out.println("Hello from Calc");

//SMELL: What does "a" mean for user of calculator? How many real calculators require enter "a" from you?
		System.out.println("Enter a: ");
//SMELL: This have to be a code, not a comment!
		//create first operand
//SMELL: Catastrophically bad name for this variable
		double a;
//SMELL: additional responsibility for main method to get first operand from console.
		Scanner scan = new Scanner(System.in);
		a = scan.nextDouble();
		scan.nextLine();

//SMELL: What does "b" mean for user of calculator? How many real calculators require enter "b" from you?
		System.out.println("Enter b: ");
//SMELL: This have to be a code, not a comment!
		//create second operand
//SMELL: Catastrophically bad name for this variable
		double b;
//SMELL: additional responsibility for main method to get second operand from console.
		b = scan.nextDouble();
		scan.nextLine();
		
//SMELL: additional responsibility for main method to get operation sign from console.
		System.out.println("Enter operation sign: ");
//SMELL: Redundant comment leading to misunderstanding.
		//create operation
//SMELL: Bad name for the variable.
		String op = scan.nextLine();
		
//SMELL: Redundant comment.
		// select which one operation was selected
//SMELL: Additional responsibility of main method to provide calculation
		
//SMELL: To add more operations we need to modify this code.
		switch(op){
		case "+":
			System.out.println("Result: " + a + " " + op + " " + b + " = " + (a+b));
			break;
		case "-":
//SMELL: Repetitions in code.
			System.out.println("Result: " + a + " " + op + " " + b + " = " + (a-b));
			break;	
		case "*":
			System.out.println("Result: " + a + " " + op + " " + b + " = " + (a*b));
			break;	
		case "/":
			System.out.println("Result: " + a + " " + op + " " + b + " = " + (a/b));
			break;	
		}
		
	}

}
