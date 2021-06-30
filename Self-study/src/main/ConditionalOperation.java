package main;

public class ConditionalOperation {

	public static void main(String[] args) {
		double nominator = 5, denominator = 2;
		double result = nominator % denominator; 
		System.out.println("Result: " + ((denominator != 0)?result:"division by zero is not allowed"));
	}
}