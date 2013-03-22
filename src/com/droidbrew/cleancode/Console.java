package com.droidbrew.cleancode;

import java.util.Scanner;

abstract class Console{
	double doubleData;
	String stringData;
	Scanner scan;
		
	public Console getData(){
		scan = new Scanner(System.in);
		introduceData();
		scanData();
		clearScanner();
		return this;		
	}
	
	abstract protected void introduceData();
	
	abstract protected void scanData();
	
	protected void clearScanner(){
		
	}
	
	public double getDouble(){
		return doubleData;
	}
	
	public String getString(){
		return stringData;
	}
}

abstract class DoubleReader extends Console{
	@Override
	protected void scanData(){
		doubleData = scan.nextDouble();
	}
	@Override
	protected void clearScanner(){
		scan.nextLine();
	}
}

class FirstOperandReader extends DoubleReader{
	@Override
	protected void introduceData() {
		System.out.println("Enter first operand: ");
	}
}

class SecondOperandReader extends DoubleReader{
	@Override
	protected void introduceData() {
		System.out.println("Enter second operand: ");
	}
}

class OperationReader extends Console{
	@Override
	protected void introduceData() {
		System.out.println("Enter operation sign: ");
	}

	@Override
	protected void scanData() {
		stringData = scan.nextLine();
	}
}


