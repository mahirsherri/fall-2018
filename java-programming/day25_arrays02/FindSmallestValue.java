package day25_arrays02;

public class FindSmallestValue {
	public static void main(String[] args) {
		/*
		 * create array nums and assign several values
		 * print the smallest value in array
		 */
		int nums[] = {100, 230, 0, 234, 345, 123}; 
		
		int smallest = nums[0];
		
		for(int n : nums) {
//			if( n < smallest) {
//				smallest = n;
//			}else{
//			    smallest = smallest;
//			}
			smallest = n < smallest ? n : smallest;
		}
		
		System.out.println(smallest);
		
		
	}
}
