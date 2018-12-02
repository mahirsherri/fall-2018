package day49_inheritrance03;

public class StudentTests {
	public static void main(String[] args) {
		Student student = new Student();
		OnlineStudent onlineStudent = new OnlineStudent();
		OnCampusStudent onCampusStudent = new OnCampusStudent();
		
		student.attendAClass();
		onlineStudent.attendAClass();
		onCampusStudent.attendAClass();
		
	}
}
