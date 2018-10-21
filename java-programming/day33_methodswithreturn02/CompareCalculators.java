package day33_methodswithreturn02;

import day31_methods02.Calculator;

public class CompareCalculators {
	public static void main(String[] args) {
		
		Calculator.add(50, 5); //VOID version
		//will not work since add is void
		//double result=Calculator.add(3.0, 4.0); 
		
		double result=CalculatorV2.add(3.0, 4.0);//return version
		
		if(result == 7.0) {
			System.out.println("PASS");
		}else{
			System.out.println("FAIL");
		}
		
		System.out.println( CalculatorV2.add(30.0, 40.0) );
		
		System.out.println( CalculatorV2.calculate(44, 22, '-') );
		
	}
}
