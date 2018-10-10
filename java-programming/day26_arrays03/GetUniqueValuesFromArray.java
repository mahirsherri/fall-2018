package day26_arrays03;

public class GetUniqueValuesFromArray {
	public static void main(String[] args) {
		
		int[] nums = new int[]{1, 2, 1, 4};
		                     //0  1  2  3
		//take a number from array 
		//compare with the rest of numbers in the array. if no matches found
		//it is unique and print it out
		
		//take a number from array 
		//create a variable counter and assign 0 to it. int counter = 0;
		//compare the number with all other numbers(dont compare the number with itself)
		//if a match found counter++, if not dont touch counter
		//check if counter is still 0 , if yes, print that number because it is unique
		
		for(int outer = 0; outer < nums.length; outer++) { //0
			int currentNum = nums[outer]; // 1
			boolean unique = true;
			
			for(int inner = 0; inner < nums.length; inner++) { //2
				if(nums[inner] == currentNum && outer != inner) { // 1
					unique = false;
					break;
				}
			}
			
			if(unique) {
				System.out.print(currentNum + " ");
			}
	
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
