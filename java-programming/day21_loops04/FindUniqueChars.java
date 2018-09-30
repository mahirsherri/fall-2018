package day21_loops04;

public class FindUniqueChars {
	public static void main(String[] args) {
		/*
		 * 3. Accept a String and print only unique characters in the String:
		 * speedlimit
		 * spedlimt
		 * 
		 * aaahhhrrriiiee
		 * ahrie
		 * 
		 * "java"
		 * 
		 * "jav"
		 */
		String word = "AABCCDD";
		            // 0123 
		String unique = "";
//		int i = word.length()-1;
//		System.out.println(word.substring(i,i+1));
		
		for(int i=0;i < word.length(); i++) {
			//System.out.println( word.substring(i, i+1) );
			String letter = word.substring(i, i+1);
			if(!unique.contains(letter)) {
				unique = unique + letter;
			}
		}
		
		System.out.println(unique);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
