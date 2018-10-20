package day32_methodswithreturn01;

public class AccumulatorMethods {
	
	public static void main(String[] args) {
		String myStars = getStars(5);
		System.out.println(myStars);
		
		System.out.println( getStars(10) );
		
		int[] nums = {1,2,3,4,5,6,7,8,7,6,5,4,3,2,1};
		
		for (int n : nums) {
			System.out.println( getStars(n) ) ;
		}
		
		printStars(3);
		
//		String str = printStars(3);
//		System.out.println(str);
		
//		System.out.println( printStars(3) );
		
	}
	
	//method: getStars that accepts an int and returns a string
	//it will return that many * s from method.
	// getStars(5) -> *****
	// getStars(2) -> **
	
	public static String getStars(int count) {
		String stars = "";
		
		for(int i=1; i<=count; i++) {
			stars += "*"; // add one more star
		}
		
		return stars;
	}
	
	
	
	public static void printStars(int count) {
		String stars = "";
		
		for(int i=1; i<=count; i++) {
			stars += "*"; // add one more star
		}
		
		System.out.println( stars );
	}
	
	
	
	
	
	
	
	
	/*
	 * method: sumToN: accepts an int and return sum of ints starting from 1 to that int.
	 * sumToN(3) -> 6  (1+2+3)
	 * sumToN(5) -> 15 (1+2+3+4+5)
	 */
	

	
}
