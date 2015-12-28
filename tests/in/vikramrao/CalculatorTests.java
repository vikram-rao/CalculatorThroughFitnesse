package in.vikramrao;

import fit.ColumnFixture;

public class CalculatorTests extends ColumnFixture {
	public int left, right;
	public String operator;
	
	public int result() {
		switch(operator) {
			case "+":
				return add(left, right);
			case "-":
				return subtract(left, right);
		}
		return 0;
	}
	
	public int add(int left, int right) {
		return left + right;
	}
	
	public int subtract(int left, int right) {
		return left - right;
	}
}