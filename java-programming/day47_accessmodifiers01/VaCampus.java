package day47_accessmodifiers01;
//VaCampus has-a VaCampusStudent
public class VaCampus {
	
	VaCampusStudent campusStudent = new VaCampusStudent();
	
	public static void main(String[] args) {
		Student student = new Student();
		student.name = "Serik"; //public
		//student.ssn ssn is private. Only visible in student class
		student.age = 27;
		student.campus = "Mclean VA";
		
		
	}
}
