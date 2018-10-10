package day26_arrays03;

public class ToCharArray {
	public static void main(String[] args) {
		String word = "Hello";
		char[] letters = word.toCharArray();
		
		for(char letter : letters) {
			System.out.println(letter);
		}
		
		String gift = "Diamond Ring";
		//convert to char array. and print reverse
		
		char[] chars = gift.toCharArray();
		
		for(int i = chars.length-1; i >= 0; i--) {
			System.out.print(chars[i]);
		}
		
		
	}
}

 