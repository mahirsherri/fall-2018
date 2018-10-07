package day25_arrays02;

public class CountMatches {
	public static void main(String[] args) {
		/* create a double array called prices
		 * assign 10 or more different prices
		 * using a loop count how many items that is more than $20
		 * print the count
		 * if no price was found that is more than $20 then print
		 * "No items that costs more than $20"
		 */
		double[] prices = {3.43, 234, 3, 12, 54, 98, 5.34, 19.99, 98.23, 100, 2.30};
		int count = 0;
		for (double price : prices) {
			if(price > 20.0) {
				count++;	
			}
		}
		
		if(count == 0) {
			System.out.println("No items for more than $20");
		}else {
			System.out.println(count + " items with more than $20");
		}
		
	}
}
