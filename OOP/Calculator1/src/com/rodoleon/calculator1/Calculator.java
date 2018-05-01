package com.rodoleon.calculator1;

public class Calculator implements Operation{
	private double OperandOne;
	private String Operation;
	private double OperandTwo;
	private double Results;
	
	public Calculator() {
		OperandOne=0;
		OperandTwo=0;
		Operation="";
		Results=0;
	}
	public void setOperandOne(double OpOne) {
		this.OperandOne = OpOne;
	}
	public void setOperandTwo(double OpTwo) {
		this.OperandTwo = OpTwo;
	}
	public void setOperation(String oper) {
		this.Operation = oper;
	}
	public double getOperandOne() {
		return this.OperandOne;
	}
	public double getOperandTwo() {
		return this.OperandTwo;
	}
	public String getOperation() {
		return this.Operation;
	}
	public double getResults() {
		System.out.println(Results);
		return this.Results;
	}
	public void performOperation() {
		if (Operation == "+") {
			Results = (OperandOne + OperandTwo);
		} else if(Operation == "-") {
			Results = (OperandOne - OperandTwo);
		}
	}
}
