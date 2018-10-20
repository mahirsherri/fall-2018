package day32_methodswithreturn01;

import java.util.*;

public class GuessTheNumber {
	//playGuessNumComputerOnly()
	//playGuessNumWithLimit(int limit)
	//playGuessNumComputerVSMe(int secretNum)
	
	public static void main(String[] args) {
		//playGuessNumComputerOnly();
		playGuessNumWithLimit(10);
		playGuessNumWithLimit(8);
		playGuessNumWithLimit(9);
		playGuessNumWithLimit(6);
	}
	
	

	public static void playGuessNumComputerOnly() {
		Random random = new Random();
		int secretNumber = random.nextInt(11);
		int counter = 0;
		do {
			counter++;
			System.out.println("Guess the secret number:");
			int guessNumber = random.nextInt(11);
			System.out.println("Guessing :" + guessNumber + " Counter:"+ counter);
			//check if secretNumber matches guessNumber
			if(guessNumber == secretNumber) {
				System.out.println("You won! Guessed the Secret Number!");
				break;
			}else {
				System.out.println("Wrong! Try again");
			}
			
		}while(true);
	}
	
	public static void playGuessNumWithLimit(int limit) {

		
		Random random = new Random();
		int secretNumber = random.nextInt(11);
		int counter = 0;
		do {
			counter++;
			System.out.println("Guess the secret number:");
			int guessNumber = random.nextInt(11);
			System.out.println("Guessing :" + guessNumber + " Counter:"+ counter);
			//check if secretNumber matches guessNumber
			if(guessNumber == secretNumber) {
				System.out.println("You won! Guessed the Secret Number!");
				break;
			}else {
				System.out.println("Wrong! Try again");
			}
			
			if(counter == limit) {
				System.out.println("You Lost! Game over!");
				break;
			}
			
		}while(true);
	}
	
	
	public static void sayHi() {
		System.out.println(1234);
		System.out.println("Hello");
		System.out.println(true);
		
		
	}
	
	
	public static void sayHi(int n) {
		System.out.println("Hello!");
	}
	
		
	
	
}
