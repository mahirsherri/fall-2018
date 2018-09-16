package day13_stringmanipulation;

public class StringContains {
	public static void main(String[] args) {
		String word = "water";
		System.out.println(word.contains("t"));
		
		System.out.println(word.startsWith("w"));
		System.out.println(word.endsWith("r"));
		System.out.println(word.endsWith("er"));
		
		String str = "";
		System.out.println(str.isEmpty());
		
	}
}
