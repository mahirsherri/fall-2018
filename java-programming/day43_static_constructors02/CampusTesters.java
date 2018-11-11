package day43_static_constructors02;

public class CampusTesters {
	public static void main(String[] args) {
		Campus.city = "Mclean";
		Campus.aboutCampus();
		
		Campus c = new Campus();
		System.out.println(c.city);
		c.aboutCampus();
	}
}
