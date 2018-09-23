package day17_reviewsession02;

public class DynamicSubstring {
	public static void main(String[] args) {
		
		/*
		 * indexOf -> accepts a string and finds the position
		 * String str = "abc start";
		 * str.indexOf("b") -> 1
		 * str.indexOf("start") -> 4
		 * 
		 * find the position of "learning"
		 * find the position of "programming"
		 * pass those numbers to substring and retreive "C++"
		 */
	    String sentence = "We are learning Asishian programming";
		//find the position of "learning"
	    int start = sentence.indexOf("learning"); //
	    //find the position of "programming"
		int end = sentence.indexOf("programming");
		
		System.out.println(start);
		System.out.println(end);
		
		start += "learning".length();
		
		String language = sentence.substring(start, end);
		System.out.println(language.trim());
		
		
		
		
		
		
		
		
		
		
	}
}
