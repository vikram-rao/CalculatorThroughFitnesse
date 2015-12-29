package in.vikramrao;

import fit.ColumnFixture;

public class CalculatorTests extends ColumnFixture {
	public double left, right;
	public String operator;

	public double result() {
		switch(operator) {
			case "+":
				return add(left, right);
			case "-":
				return subtract(left, right);
			case "*":
				return multiply(left,right);
			case "/":
				return divide(left,right);
		}
		return 0;
	}

	public double add(double left, double right) {
		return left + right;
	}

	public double subtract(double left, double right) {
		return left - right;
	}

	public double multiply(double left, double right) {
		return left * right;
	}

	public double divide (double left, double right) {
		return left / right;
	}

}