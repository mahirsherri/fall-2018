package day5_operators;

public class OperatorsPractice {
	public static void main(String[] args) {
		//declare variable apples and assign 5
		// add 10 more apples using shorthand operator
		int apples = 5;
		apples += 10;
		System.out.println("Apples are " + apples);
				
		//declare variable carsInLot and assign 23
		//decrease carsInLot by 10 using short hand operator
		int carsInLot = 23;
		//carsInLot = carsInLot - 10;
		carsInLot -= 10;
		System.out.println(carsInLot +" cars in parking lot");
		//declare variable pizzaSlices and assign 12 to it
		//divide pizzaSlices amoung 5 ppl and assign the amount 
		//each person gets back to pizzaSlices
		double pizzaSlices = 12;
		pizzaSlices /= 5;
		System.out.println("Each person gets " + pizzaSlices + " slices");
		//declare variable minutes and assign 100 to it
		//find out how many remaining minutes that do not make another hour
		//and assign back to minutes also add another variable hours
		//and assign whole hours count to it
		int minutes = 1000000;
		//find out how many whole hours 
		int hours = minutes / 60;
		System.out.println("Hours: " + hours);
		
		minutes %= 60; //100 / 60 -> remainder -> 40
		System.out.println("Remaining Minutes: " + minutes);

	}
}
