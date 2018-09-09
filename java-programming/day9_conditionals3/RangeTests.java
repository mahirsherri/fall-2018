package day9_conditionals3;

public class RangeTests {
	public static void main(String[] args) {
		
		
		//check if students is more than or equal to 5 and less than 30
		//print "lets do mentoring session"
		//students more then or equal to 30 and less than or equal to 60. 
		//print lets have a lecture
		//if more than 60:
		// print how many students need to take class online
		int students = -60;
		if(students >= 5 && students < 30) {
			System.out.println("Lets do Mentoring session");
		}else if(students >= 30 && students <= 60) {
			System.out.println("Lets have a Lecture");
		}else if(students > 60) {
			int online = students - 60;
			System.out.println(online + " students need to join class online");
		}else {
			System.out.println("Students need to be more than or equal to 5");
		}
		
		
		
	}
}
