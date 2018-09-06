package day7_conditionals;

import java.util.Scanner;

public class WarmUpTask {
	public static void main(String[] args) {
		/*
		 * Program that converts USD to EUR
		 * 						 EUR to USD
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("USD Amount:");
		double $ = scan.nextDouble();
		//current live exchange rates
		double usd2eurExchangeRate = 0.859594;
		double eur2usdExchangeRate = 1.1633399;
		
		double euros = $ * usd2eurExchangeRate;
		
		System.out.println($ + " USD = " + euros + " EUR");
		
		double usdFromEuros = $ * eur2usdExchangeRate;
		
		System.out.println($ + " EUR = " + usdFromEuros + " USD");
	}
}
