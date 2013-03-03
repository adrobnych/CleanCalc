import java.util.Scanner;


public class MainCalc {

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
