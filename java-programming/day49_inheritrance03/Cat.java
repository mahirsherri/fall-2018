package day49_inheritrance03;

public class Cat extends Animal {
	public Cat() {
		super("Garfield");
		System.out.println("Cat object is created");
	}
	
    @Override
	public void speak() {
		System.out.println("Meow");
	}

}
