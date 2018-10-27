package day36_overloading_arraylist;

import java.util.ArrayList;

public class WrapperArrayListValues {
	public static void main(String[] args) {
		Integer n = 100;
		int n2 = 100;
	   	
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(300);
		nums.add(500);
		nums.add(1234);
		nums.add(654);
		
		System.out.println(nums);
		System.out.println(nums.toString());
		
		//for EACH loop
		for(Integer num : nums) {
			System.out.println(num);
		}
		System.out.println("=============");
		for(int num : nums) {
			System.out.println(num);
		}
		
		System.out.println("=============");
		//print each value using for loop.
		for(int j=0; j < nums.size(); j++) {
			System.out.println(nums.get(j));
		}
		
	}
}
