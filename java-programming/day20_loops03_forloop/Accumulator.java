package day20_loops03_forloop;

public class Accumulator {
	public static void main(String[] args) {
		/*
		 * Write a program to calculate sum of all numbers
		 * between 1 and 5
		 * 1,2,3,4,5 -> 15
		 */
		int sum = 0;
		
		for(int i = 1; i<=5; i++) {
			sum=sum+i; 
		}
		System.out.println("Sum is " + sum);
		
		/*
		 *Program to calculate the sum of all odd and even numbers
		 *between 0 and 100
		 *sumOfOdds -> will have all sum of odd numbers
		 *sumOfEvens -> will have all sum of even numbers
		 */
		int sumOfOdds = 0;
		int sumOfEvens = 0;
		for(int n = 0; n <= 100; n++ ) {
			if(n % 2 == 0) {
				//sumOfEvens = sumOfEvens + n;
				sumOfEvens += n;
			}else {
				sumOfOdds = sumOfOdds + n;
			}
		}
		System.out.println("sumOfOdds " + sumOfOdds);
		System.out.println("sumOfEvens " + sumOfEvens);
		
	}
}
