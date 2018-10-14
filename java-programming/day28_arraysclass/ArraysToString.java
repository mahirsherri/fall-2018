package day28_arraysclass_multiD;

import java.util.Arrays;

public class ArraysToString {
	//toString method is present in all java classes, and it is used to describe
	//the object
	public static void main(String[] args) {
		int[] nums = {7,32,5,23};

		System.out.println(  Arrays.toString(nums) );
		
		//sort this array
		Arrays.sort(nums);
		
		//print again
		System.out.println(  Arrays.toString(nums) );

	}
}
