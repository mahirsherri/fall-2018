package day43_static_constructors02;

public class Calculations {
	public static void main(String[] args) {
		System.out.println(Calculator.plus(5, 3));
		System.out.println(Calculator.minus(50, 3));
		
		Calculator HeydarsCalculator = new Calculator();
		System.out.println(HeydarsCalculator.multiply(4, 2));
		System.out.println(HeydarsCalculator.plus(10, 30));
		System.out.println(HeydarsCalculator.minus(100, 30));
		
		//Calculator.operation = "add"; will not work
		HeydarsCalculator.operation = "math calculations";
		testStatic();
	}
	
	public static void testStatic() {
		System.out.println("This is static method");
	}
}
