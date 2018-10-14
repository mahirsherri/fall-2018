package day28_arraysclass_multiD;

public class ArraysPrintFirstAndLast {
	public static void main(String[] args) {
		
		String[] words = {"helloooo", "why", "by", "apple" , "note", "water"};
		
//		for(String word : words ) {
//			System.out.print(word.charAt(0));
//			System.out.println(word.charAt( word.length() -1 ));
//		}
		//using single println statement
//		for(String word : words ) {
//			System.out.println(word.charAt(0) +""+ word.charAt( word.length() -1 ));
//		}
		
		//USING SUBSTRING
//		for(String word : words ) {
//			System.out.println(word.substring(0,1));
//			System.out.println(word.substring(word.length() -1));
//		}
		//PRINT IN SINGLE LINE
		for(String word : words ) {
			System.out.println(word.substring(0,1) + word.substring(word.length() -1));
		}
			
		for(int i=0; i<words.length; i++) {
			System.out.println(words[i].substring(0,1) + words[i].substring(words[i].length() -1));
		}
		
	}
}
