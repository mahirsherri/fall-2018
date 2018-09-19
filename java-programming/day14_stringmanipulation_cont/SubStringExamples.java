package day14_stringmanipulation_cont;

public class SubStringExamples {
	public static void main(String[] args) {
		// substring gets part of a string
		// tehre are two versions, 1 takes 1 int, 1 takes 2 ints
		// 1 INT
		// if it takes 1 int, it means starting point
		// we cannot give a number bigger than the lengh, it will throw exception
		// if we give number equal to the length, it will return empty string
		String str = "donaldtheduck@gmail.com";
		System.out.println(str.substring(14));
		// 2 INT
		// first numer is the where the new string will string from
		// second number is where the new string will end
		System.out.println(str.substring(19, 20));

	}
}
