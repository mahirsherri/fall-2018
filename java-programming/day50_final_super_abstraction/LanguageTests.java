package day50_final_super_abstraction;

public class LanguageTests {
	public static void main(String[] args) {
		ProgrammingLanguage pl = new ProgrammingLanguage();
		pl.printName();//Language: General Language since 
		//printName is running from Parent class
		
		pl.printProgrammingName();
		
		System.out.println(pl.name);
		
		pl.staticMethod();
		
		pl.printName();
	}
}
