package day12_classobject_strings;

public class StringClass {
	public static void main(String[] args) {
		String name = "Murodil"; 
		/*
		 * 1. Declaring a variable -> String name. 
		 * 		-> variable name is name and type is String
		 * 		-> Hey java, I want you to create a variable called name 
		 * 		-> that can store String object
		 * 2. Assign value - String object.
		 * 		Anything in double quotes is String object with that value
		 */
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name);//original data Murodil
		name = name.toUpperCase();//update and re-assign to name
		System.out.println(name);//All caps: MURODIL
		
		System.out.println( name.length() ); //7
		System.out.println(  "java".length()  );
		
		int count = name.length();
		System.out.println("Count is " + count);
		
		System.out.println(name.charAt(0));
		
		if(name.charAt(0) == 'M') {
			System.out.println("M is first letter");
		}else {
			System.out.println("M is not first letter");
		}
		
		char secondChar = name.charAt(1);
		System.out.println(secondChar);
		
	}
}





