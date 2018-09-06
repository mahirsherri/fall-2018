package day7_conditionals;

public class IfElseStatement {
	public static void main(String[] args) {
		double coffeePrice = 6.00;
		
		if(coffeePrice <= 6.0) {
			System.out.println("I will get coffee");
		}else {
			System.out.println("I will not get coffee. Too expensive");
		}
		
		double accountBalance = 450.50;
		double price = 700;
		//if you have enough money, you buy the item
		// otherwise you say not enough balance
		if(accountBalance >= price) { //price <= accountBalance
			System.out.println("Lets buy the item!");
			System.out.println("I am ordering online");
		}else {
			System.out.println("Not enough balance, not buying");
			System.out.println("Lets wait for paycheck");
		}
		
		/*
		 * 2 variables: speedLimit, currentSpeed
		 * if currentSpeed is more than 20 mph compared to speedLimit
		 * then you are getting a speeding ticket,
		 * otherwise keep driving
		 */
		// = -> assignment operator
		// == -> comparison operator. equals operator
		System.out.println("===================");
		int speedLimit , currentSpeed;
		speedLimit = 55;
		currentSpeed = 65;
		
		if(currentSpeed >= speedLimit+20) {
			System.out.println("Hey, slow down");
			System.out.println("You are going to get a ticket");
		}else {
			System.out.println("Good job");
			System.out.println("Keep driving");
		}
	
		
		
			
	}
}






