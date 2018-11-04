package day41_classes02_encapsulation;

public class Library {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setTitle("Grit");
		book1.setAuthor("Angela");
		book1.setPages(400);
		
		Book javaBook = new Book();
		javaBook.setTitle("Headfirst Java");
		javaBook.setAuthor("Kathy Sierra, Bert Bates");
		javaBook.setPages(543);
		
		System.out.println("Title1: " + book1.getTitle());
		System.out.println("Title2: " + javaBook.getTitle());
		
		System.out.println("Author1: " + book1.getAuthor());
		System.out.println("Author2: " + javaBook.getAuthor());
		
		
		
	}
}
