package day30_methods01;

import java.util.Arrays;

public class MethodsIntro {

	public static void main(String[] args) {
		
		MethodsIntro.sayHello();
		askHowRU();
		sayHello();
		reply();
		
		String str = "java";

		int l = str.length();
		str.charAt(1);
	
		System.out.println("I am doing great! thanks");
		
		sayBye();
		sayBye();
		sayHelloTo("Trump");
		
		String nameofOnlineFriend = "Umit";
		sayHelloTo(nameofOnlineFriend);
		
		//sayHelloTo(100); will not work
		sayHelloTo("100");
		
	}	
	
	
	public static void sayHelloTo(String name) {
		System.out.println("Hello " + name);
	}
	
	
	public static void sayHello() {
		System.out.println("Hello");
	}
	
	
	
	/*
	 * Write a method askHowRU that asks "how are you doing?"
	 * 
	 */
	public static void askHowRU() {
		System.out.println("How are you doing?");
	}
	
	
	/*
	 * write a method reply. that prints "I am doing well, how about you?"
	 */
	
	public static void reply() {
		System.out.println("I am doing well, how about you?");
	}
	
	/*
	 * Write a method sayBye. that says "Bye! Have a good day!"
	 */
	public static void sayBye() {
		System.out.println("Bye! Have a good day!");
	}
	
}


