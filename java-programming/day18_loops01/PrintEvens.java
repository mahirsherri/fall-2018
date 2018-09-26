package day18_loops01;

public class PrintEvens {
	public static void main(String[] args) {
		/*
		 * Using if condition within while loop:
		 * start variable number with 1
		 * and loop until 100
		 * check if number is even:
		 * 	print the number
		 */
		int number = 1;
		
		while(number <= 100) {
			if(number % 2 == 0) {
				System.out.println(number);
			}
			++number;
		}
		System.out.println("after while loop");
	}
}
