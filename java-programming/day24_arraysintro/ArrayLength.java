package day24_arraysintro;

public class ArrayLength {
	public static void main(String[] args) {
		//declare array names that store 5 names
		String[] names = new String[5];
		names[0] = "Serik";
		names[1] = "Khalili";
		names[2] = "Z";
		//names[3] = "Erkam";
		//names[4] = "Zarina";
		
		//count of values in array. not paranthesis
		System.out.println( names.length );
		System.out.println( names[4] );
		
		//String name and assign Khalili to it by reading from array
		String name = names[1];
		// count of characters in String
		System.out.println( name.length() ); 
		
	}
}
