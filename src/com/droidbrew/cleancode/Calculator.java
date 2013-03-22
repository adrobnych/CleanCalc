package com.droidbrew.cleancode;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

	private double firstOperand;
	private double secondOperand;
	private String operation;
	Map<String, Operation> operations;
	
	Calculator(){
		operations = new HashMap<>();
		operations.put("+", new PlusOperation());
		operations.put("-", new MinusOperation());
		operations.put("*", new MultiplyOperation());
		operations.put("/", new DivideOperation());
	}
	
	class PlusOperation implements Operation{
		public double calculate(){
			return firstOperand + secondOperand;
		}
	}
	
	class MinusOperation implements Operation{
		public double calculate(){
			return firstOperand - secondOperand;
		}
	}
	
	class MultiplyOperation implements Operation{
		public double calculate(){
			return firstOperand * secondOperand;
		}
	}
	
	class DivideOperation implements Operation{
		public double calculate(){
			return firstOperand / secondOperand;
		}
	}
	
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
		return "Result: " + firstOperand + " " + operation + " " + secondOperand + " = " +
				operations.get(operation).calculate();
	}

}
