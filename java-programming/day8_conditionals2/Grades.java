package day8_conditionals2;

public class Grades {
	public static void main(String[] args) {
		/*
		 * A,B,C,D
		 * Use char variable grade
		 * if grade is A -> Excellent
		 * Grade is B -> Good
		 * Grade is C -> Acceptable
		 * Grade is D -> Fail
		 * Anything other that -> Not a valid grade
		 */
		char grade = 'E';
		
		if (grade == 'A') {
			System.out.println("Excellent");
			System.out.println("Keep it up");
		}else if(grade == 'B') {
			System.out.println("Good");
			System.out.println("Good job");
		}else if (grade == 'C') {
			System.out.println("Acceptable");
			System.out.println("Practice more");
		}else if(grade == 'D') {
			System.out.println("Fail");
			System.out.println("Work harder");
		}else{
			System.out.println("Invalid Grade. Only A,B,C,D allowed");
		}
		
	}
}
