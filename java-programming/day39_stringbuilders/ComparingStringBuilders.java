package day39_stringbuilders;

public class ComparingStringBuilders {
	public static void main(String[] args) {
		StringBuilder builder1 = new StringBuilder("java");
		StringBuilder builder2 = new StringBuilder("java");
		
		System.out.println(builder1 == builder2);//false. Since both objects are different locations
		System.out.println(builder1.equals(builder2));//false. 
		//equals method in StringBuilder also checks if both of them are same memory location
		//HOW DO WE COMPARE?!!!!
		/*
		 * Convert to String then call String's equals method
		 */
		boolean isEqual = builder1.toString().equals(builder2.toString());
		System.out.println(isEqual);
		
		StringBuilder builder3 = builder1;
		System.out.println(builder3 == builder1);
		System.out.println(builder3.equals( builder1));
		
		System.out.println(builder1);
		System.out.println(builder3);
		
		builder3.append(" programming");
		
		System.out.println(builder1);
		System.out.println(builder3);
		
		StringBuilder builder4 = new StringBuilder(builder1);
		System.out.println(builder4);
		
		builder1.append("!!!");
		System.out.println(builder4);
		System.out.println(builder1);
	}
}
