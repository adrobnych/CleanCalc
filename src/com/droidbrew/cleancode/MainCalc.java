package com.droidbrew.cleancode;
import java.util.Scanner;


public class MainCalc {
	
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
		
		Calculator calculator = new Calculator();
		calculator.inputFirstOperand(firstOperand);
		calculator.inputSecondOperand(secondOperand);
		calculator.inputOperation(operation);
		
		System.out.println(calculator.execute());
		
		scan.close();
		
	}

}
