package day4_operators;

public class AgeCalculator {
	public static void main(String[] args) {
		//Program to calculate age for a given birth year
		//currentYear, yearOfBirth, age
		int currentYear = 2018;
		int yearOfBirth = 1815;
		int age = currentYear - yearOfBirth;
		
		//if you are born on <this> year then you are <this> years old
		System.out.println("If you are born on "
							+yearOfBirth+" year then you are "
							+age + " years old.");
		String output="If you are born on "+yearOfBirth+" year then you are "+age + " years old.";
		System.out.println(output);
	}
}	
