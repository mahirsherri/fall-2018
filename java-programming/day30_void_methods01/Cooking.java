package day30_methods01;

public class Cooking {
	
	public static void main(String[] args) {
		cook("Steak");
		youWillNeed("Meat, Oil, Salt, pepper, Wooden Spoon, tomato, onions, garlic rosemary");
		cookFor(10, "Grilling");
		ready();
		
	
	}
	
	/*
	 * method cook accepts String food name, and prints
	 * "Today we are cooking foodName."
	 */
	public static void cook(String foodName) {
		System.out.println("Today we are cooking " + foodName +"." );
	}
	
	/*
	 * method youWillNeed, accepts a String with things we need
	 * prints "We need following items: items"
	 */
	
	public static void youWillNeed(String items) {
		System.out.println("We need following items: " + items + ".");
	}
	
	
	/*
	 * method cookFor accepts minutes and way of cooking and prints:
	 *"You need to cook for minutes by wayOfCooking
	 * 
	 */
	
	public static void cookFor(int minutes, String wayOfCooking) {
		System.out.println("You need to cook for " + minutes +" minutes by " + wayOfCooking +".");
	}
	
	/*
	 * method ready, does not accept any parameters,
	 * prints : Meal is ready! Enjoy!
	 * 
	 */
	
	public static void ready() {
		System.out.println("Meal is ready! Enjoy!");
	}
	
	
}
