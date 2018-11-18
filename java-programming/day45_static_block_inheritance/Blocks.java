package day45_static_block_inheritance;

public class Blocks {
    static int num = 100;
	static String str;
	//#1
	static {
		//System.out.println(num);
		System.out.println("static block");
		num = num + 1000;
		str = "Hello";
	}
	
	//#2
	{
		System.out.println("init block");

		num += 500;
		str = str + " world";
	}
	//#3
	public Blocks() {
		System.out.println("constructor ");

		num = num * 2;
		str = str + "!!!";
	}
	
}
