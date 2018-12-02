package day49_inheritrance03;

public class OnCampusStudent extends Student {
	
	@Override
	public void attendAClass() {
		System.out.println("On-campus student is attending a class in the classroom");
	}
}
