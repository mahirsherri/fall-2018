package day8_conditionals2;

public class LogicalOperators {
	public static void main(String[] args) {
		/*
		 * AND -> &&
		 * OR -> ||
		 * NOT -> !
		 * 
		 */
		int pincode = 0;
		
		if(!(pincode > 0)) {
			System.out.println("Pincode cannot be 0 or negative number");
		}else {
			System.out.println("Pincode accepted");
		}
		
	}
}
