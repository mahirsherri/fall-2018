package day18_loops01;

/*
	*
	**
	***
	****
	*****
	******
 */
public class StairCase {
	public static void main(String[] args) {
		
		String stairs = "";
		int count = 1;
		
		
		while(count <= 3) {
			stairs = stairs + "*";
			System.out.println(stairs);
			count++;
		}
		
		/*
		stairs = stairs + "*";//*
		System.out.println(stairs);
		stairs = stairs + "*";//**
		System.out.println(stairs);
		stairs = stairs + "*";//***
		System.out.println(stairs);
		*/
	}
}
