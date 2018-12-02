package day49_inheritrance03;

public class Tests {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();
		
		animal.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		
		ToStringDemoClass demo = new ToStringDemoClass();
		System.out.println(demo.toString());
		ToStringDemoClass demo2 = new ToStringDemoClass();
		System.out.println(demo2.toString());
	}
}
