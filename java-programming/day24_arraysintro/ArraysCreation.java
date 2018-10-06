package day24_arraysintro;

public class ArraysCreation {
	public static void main(String[] args) {
		//declare array that can hold 5 items
		int[] numbers = new int[5];
		//assign values. We go by index that starts from 0
		//0,1,2,3,4
		numbers[4] = 7654;
		numbers[0] = 234;
		numbers[1] = 432;
		numbers[2] = 100;
		numbers[3] = 54;
		
		//read from array
		System.out.println(numbers[0]);
		System.out.println(numbers[3]);
		
		numbers[0] = 1000;
		System.out.println(numbers[0]);
		
		//numbers[10] = 34567; index of out bound exception
		
		numbers[1] = numbers[2] + numbers[3];
		System.out.println(numbers[1]);
		
		//Declare a char array grades and assign A,B,C,D,E to it.
		//use any one of 3 ways to do so
		char[] grades = {'A', 'B', 'C', 'D', 'E'};
		char[] grades2 = new char[]{'A', 'B', 'C', 'D', 'E'};
		
		//print first item
		System.out.println(grades[0]);
		
		char myGrade = grades[1];
		System.out.println(myGrade);
		
		
		char[] grades3=new char[5];
        
		grades3[0]='A';
		grades3[1]='B';
		grades3[2]='C';
		grades3[3]='D';
		grades3[4]='E';
		
		//String[] cities = new String[3];
		
		String cities[]; 
		cities = new String[3];

		cities[0] = "Washington";
		cities[1] = "Los Angeles";
		cities[2] = "New York";

		String[] cities2 =  {"Chicago", "McLean", "Miami"};
		///cities2 = {"Chicago", "McLean", "Miami"};
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
