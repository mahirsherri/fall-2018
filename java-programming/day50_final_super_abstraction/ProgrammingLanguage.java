package day50_final_super_abstraction;

public class ProgrammingLanguage extends Language{
	//variable hiding. Hiding of parent class name variable
	public String name = "Programming Language-Java";
	
	public void printProgrammingName() {
		System.out.println("Programming L: " + name);
		//System.out.println(super.name); goto parent class and use name variable
	}
	
	//Hiding static method
	public static void staticMethod() {
		System.out.println("Programming Language - static method");
	}
	
	public void printName() {
		System.out.println("Language: " + name);
		staticMethod();
	}
//	
}
