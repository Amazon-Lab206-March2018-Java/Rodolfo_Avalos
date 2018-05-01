package com.rodoleon.calculator1;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator test = new Calculator();
		test.setOperandOne(10.5);
		test.setOperation("+");
		test.setOperandTwo(5.2);
		test.performOperation();
		test.getResults();
		test.setOperandOne(15.7);
		test.setOperation("-");
		test.setOperandTwo(1.08);
		test.performOperation();
		test.getResults();
	}
}
