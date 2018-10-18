package day31_methods02;

import java.util.Arrays;

public class Calculations {
	public static void main(String[] args) {
		//lets add 1234 + 400 using add method of Calculator class
		Calculator.add(1234, 400);
		//we are mentioning the class name because divide method is not 
		//in same class
		Calculator.divide(500, 10);
		
		Calculator.multiply(3, 5);
	
	}
}
