import java.util.Scanner;


public class MainCalc {
	
	//REFACTORING: after creation of methods we forced to create instance variables for storing state between method calls
	private double firstOperand;
	private double secondOperand;
	private String operation;
	
	public void inputFirstOperand(double firstOperand){
		this.firstOperand = firstOperand;
	}
	
	public void inputSecondOperand(double secondOperand){
		this.secondOperand = secondOperand;
	}
	
	public void inputOperation(String operation){
		this.operation = operation;
	}
	
	String execute(){
		return "Result: a + b = 5.0";
	}

	public static void main(String[] args) {
		System.out.println("Hello from Calc");
		
		System.out.println("Enter a: ");
		//create first operand
		double a;
		Scanner scan = new Scanner(System.in);
		a = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Enter b: ");
		//create second operand
		double b;
		b = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Enter operation sign: ");
		//create operation
		String op = scan.nextLine();
		
		// select which one operation was selected
		switch(op){
		case "+":
			System.out.println("Result: " + a + " " + op + " " + b + " = " + (a+b));
			break;
		case "-":
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
