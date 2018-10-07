package day25_arrays02;

public class SearchInArray {
	public static void main(String[] args) {
		//create array nums and assign 10 different numbers to it
		//search for a number 100 in it using a loop, once found print the index
		//location and "value found at index "+index
		//if that search value is not found print "100 not found in the array"
		//once you find 100 then exit the loop at that point, we are looking for
		//only first 100. not all of them
		
		int[] nums = {123,345,100,234,55,12344,100,1233,5543};
		int lookfor = 100;
		boolean found = false;
		
		for(int i = 0; i < nums.length; i++) {
			
			if(nums[i] == lookfor) {
				System.out.println(lookfor + " was found at index " + i);
				found = true;
				break;
			}
			
		}
		
		if(!found) {
			System.out.println(lookfor + " not found");
		}
		
	}
}
