package day6_operators_boolean;

public class IncrementDecrementOperators {
	public static void main(String[] args) {
		//sysout -> shortcut for println
		
		int windowsComputers = 35;
		//increase by one. add one
		windowsComputers++;//36
		windowsComputers++;//37
		System.out.println(windowsComputers);
		//long way
		windowsComputers = windowsComputers + 1; //38
		//shorthand operator
		windowsComputers += 1; //39
		
		System.out.println(windowsComputers);
		
		int unreadMessages = 50;
		System.out.println("Unread messages: " + unreadMessages);
		System.out.println("Reading one message");
		
		unreadMessages--;
		
		unreadMessages--;
		System.out.println("Unread messages: " + unreadMessages);
		
		
	}
}
