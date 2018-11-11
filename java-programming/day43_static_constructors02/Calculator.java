package day43_static_constructors02;

public class Calculator {
	
	public String operation;
	
	public static double plus(double num1, double num2) {
		//operation = "add";
		return num1+num2;
	}
	
	public static double minus(double num1, double num2) {
		return num1-num2;
	}
	
	public double multiply(double num1, double num2) {
		operation = "multiply";
		return num1 * num2;
	}
	
	public static void multiply2(double num1, double num2) {
		//System.out.println(multiply(num1 , num2));
	}
	
}










