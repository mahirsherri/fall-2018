package day40_customclasses;

public class Company {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.work();
		
		emp1.firstName = "Mike";
		emp1.lastName = "Smith";
		emp1.email = emp1.firstName+emp1.lastName+"@mail.com";
		emp1.jobTitle = "Scrum Master";
		emp1.hourlySalary = 65.50;
		
		emp2.firstName = "Joe";
		emp2.lastName = "Doe";
		emp2.email = emp2.firstName+emp2.lastName+"@mail.com";
		emp2.jobTitle = "SDET";
		emp2.hourlySalary = 54.55;
		
		System.out.println("Emp1 email: " + emp1.email.toLowerCase());
		System.out.println("Emp2 email: " + emp2.email);
		
		emp1.work();
		emp2.work();
		
	}
}
