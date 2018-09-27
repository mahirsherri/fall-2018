package day19_loops02;

public class SnackTime {
	public static void main(String[] args) {
		/*create a boolean variable hungry and assign true
		 *create int variable apples and assign 1 to it
		 *As long as you are hungry print "eating an apple"
		 *and increase the apple
		 *once you eat 5 apples, you are no longer hungry 
		 */
		boolean hungry = true;
		int apples = 1;
		
		while(hungry) {
			System.out.println("Eating an apple");
			if(apples == 5) {
				hungry = false;
			}else {
				apples++;
			}
		}
		
		System.out.println("Apples total:" + apples);
		
		
	}
}
