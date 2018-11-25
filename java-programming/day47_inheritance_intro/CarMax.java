package day47_inheritance_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarMax extends Object {
	
	public static void main(String[] args) {
		//create object of Vehicle class
		//instantiation of Vehicle class
		Vehicle vehicle = new Vehicle();
		vehicle.makeAndModel = "Subaru Outback";
		vehicle.year = 2018;
		vehicle.maxSpeed = 140;
		vehicle.mileage=12345;
		
		vehicle.drive();
		vehicle.stop();
		/* Will not work since horsePower and doUber is 
		 * in child class
		vehicle.hoursePower = 123;
		vehicle.doUber();
		*/
		//========Instantiate Car class.
		Car car = new Car();
		car.makeAndModel = "Toyota Prius";
		car.year = 2015;
		car.maxSpeed = 120;
		car.hoursePower = 234;
		car.mileage= 4321;
		
		car.drive();
		car.stop();
		car.doUber();
		
		System.out.println("====TRAIN====");
		
		Train train = new Train();
		train.makeAndModel = "CyberTrain 10";
		train.year = 2019;
		train.maxSpeed = 200;
		train.ticketPrice = 120.50;
		train.mileage=45678;
		
		train.drive();
		train.leaveStation();
		train.stop();
		
		System.out.println("=====ELECTRIC CAR=====");
		ElectricCar tesla = new ElectricCar();
		tesla.makeAndModel = "Tesla Model-S";
		tesla.year = 2015;
		tesla.maxSpeed = 200;
		tesla.hoursePower = 518;
		tesla.mileage = 54321;
	
		
		tesla.doUber();
		tesla.charge();
		tesla.drive();
		tesla.stop();
		System.out.println("Has Battery? - " + ElectricCar.hasBattery);
		
		
		System.out.println("=====static service calls======");
		
		Vehicle.service();
		Car.service();
		Train.service();
		ElectricCar.service();
		
		
		WebDriver driver = new ChromeDriver();
		
		
	}
}
