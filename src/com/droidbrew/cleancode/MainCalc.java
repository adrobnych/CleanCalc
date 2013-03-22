package com.droidbrew.cleancode;
import java.util.Scanner;


public class MainCalc {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();
		calculator.inputFirstOperand(getFirstOperand(scan));
		calculator.inputSecondOperand(getSecondOperand(scan));
		calculator.inputOperation(getOperation(scan));
		System.out.println(calculator.execute());
		scan.close();
	}

	private static double getFirstOperand(Scanner scan){
		System.out.println("Enter first operand: ");
		double firstOperand;
		firstOperand = scan.nextDouble();
		scan.nextLine();
		return firstOperand;
	}
	
	private static double getSecondOperand(Scanner scan){
		System.out.println("Enter secondOperand: ");
		double secondOperand;
		secondOperand = scan.nextDouble();
		scan.nextLine();
		return secondOperand;
	}
	
	private static String getOperation(Scanner scan){
		System.out.println("Enter operation sign: ");
		return scan.nextLine();
	}
}
