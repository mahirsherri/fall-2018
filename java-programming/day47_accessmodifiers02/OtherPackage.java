package day47_accessmodifiers02;

import day47_accessmodifiers01.Student;

public class OtherPackage {
	public static void main(String[] args) {
		Student student = new Student();
		student.name = "Mike";
		//student.ssn = 23423; private
		//student.age = 44;
		//student.campus = "Chicago";
	}
}
