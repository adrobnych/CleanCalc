package com.droidbrew.cleancode;


public class MainCalc {
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.inputFirstOperand((new FirstOperandReader()).getData().getDouble());
		calculator.inputSecondOperand((new SecondOperandReader()).getData().getDouble());
		calculator.inputOperation((new OperationReader()).getData().getString());
		System.out.println(calculator.execute());
	}
	
}