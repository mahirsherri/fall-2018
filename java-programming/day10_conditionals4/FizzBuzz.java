package day10_conditionals4;


/*remainder concept - :
	20 / 5  -> 4
	21 / 5  -> 4 (1 is a remainder)
	21 % 5  -> 1
	10 % 5 -> 0
	  9
	number % 3 -> 0 -> Fizz
	  20
	number % 5 -> 0 -> Buzz
	
*/
public class FizzBuzz {
	/*
	 * 3. if number is divisible by 3 (no remainder), 
	 * 				print “Fizz” .
	  if number is divisible by 5 (no remainder),
	   		print “Buzz” .
	 if number is divisible by 5 and 3, 
	 		print “FizzBuzz” 
	  Else print number itself
	 */
	public static void main(String[] args) {
		int number = 0;
		
		if(number % 3 == 0 && number % 5 == 0 ) {
			System.out.println("FizzBuzz");
		}else if(number % 3 == 0) {
			System.out.println("Fizz");
		}else if(number % 5 == 0) {
			System.out.println("Buzz");
		}else {
			System.out.println(number);
		}
		
	}
	
	
}
