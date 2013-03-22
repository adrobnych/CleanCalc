import java.util.Scanner;

//SMELL: too long class
public class MainCalc {
	
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
	
	//SMELL: violation of open/closed principle
	//SMELL: repeating code with small variations; often switch hides class hierarchies
	//SMELL: more then one responsibility for method execute
	//SMELL: too long method
	//note that smells often appear in clusters
	String execute(){
		String output = null;
		switch(operation){
		case "+":
			output = "Result: " + firstOperand + " + " + secondOperand + " = " + (firstOperand+secondOperand);
			break;
		case "-":
			output = "Result: " + firstOperand + " - " + secondOperand + " = " + (firstOperand-secondOperand);	
			break;
		case "*":
			output = "Result: " + firstOperand + " * " + secondOperand + " = " + (firstOperand*secondOperand);
			break;
		case "/":
			output = "Result: " + firstOperand + " / " + secondOperand + " = " + (firstOperand/secondOperand);
			break;
		}
		return output;
		
	}

	//SMELL: too long method;
	//SMELL: more then one responsibility
	public static void main(String[] args) {
		
		System.out.println("Enter first operand: ");
		double firstOperand;
		Scanner scan = new Scanner(System.in);
		firstOperand = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Enter secondOperand: ");
		double secondOperand;
		secondOperand = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Enter operation sign: ");
		String operation = scan.nextLine();
		
		MainCalc calculator = new MainCalc();
		calculator.inputFirstOperand(firstOperand);
		calculator.inputSecondOperand(secondOperand);
		calculator.inputOperation(operation);
		
		System.out.println(calculator.execute());
		
		scan.close();
		
	}

}
