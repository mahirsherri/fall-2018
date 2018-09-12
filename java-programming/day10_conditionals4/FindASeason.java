package day10_conditionals4;

public class FindASeason {
	/*
	 * 1. Find a season.
	    month -> number and find the season of the year 
	    for that month number.
	  
	 */
	public static void main(String[] args) {
		int month = 12;//use scanner for this
		//winter -> 12 or 1 - 2
		//spring -> 3 - 5
		//summer -> 6 - 8
		//fall -> 9 - 11
		//else reject with error message
		
		if(month == 12 || month == 1 || month == 2) {
			System.out.println("Winter");
		}else if (month >= 3 && month <= 5) {
			System.out.println("Spring");
		}else if (month >= 6 && month <= 8) {
			System.out.println("Summer");
		}else if (month >= 9 && month <= 11) {
			System.out.println("Fall");
		}else {
			System.out.println("Invalid month. 1 - 12 accepted");
		}
		
	}
	
	
	
}
