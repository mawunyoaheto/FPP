package quiz3_practice;

import java.util.Arrays;


public class Main {

	public static void main(String[] args) {

		Bike b5 = new Bike(0, "Expo", 16.7, "Aircycle");
		Bike b6 = new Bike(0, "Mountain", 16.7, "Aircycle");

		Bike b = new Bike(0, "Toddy", 16.7, "Aircycle");
		Bike b2 = new Bike();

		Motorcycle m = new Motorcycle();
		Motorcycle m2 = new Motorcycle(2, "YAMAHA", 64.7, 2.4f);

		Car c = new Car();
		Car c2 = new Car(6, "Dodge", 146.8, "Truck");

		Bike b1 = new Bike();
		Bike b3 = new Bike(2, "Mountain", 35.6, "Racing");

		System.out.println(b1.equals(b2));

		Vehicle[] vehicles = { b5, b6, b, m, m2, c, c2, b3 };

		for (Vehicle v : vehicles) {
			System.out.println(v);
		}

		System.out.println("\n*************After Arrays.sort()*****************");

		Arrays.sort(vehicles);

		for (Vehicle v : vehicles) {
			System.out.println(v);
		}
	}

}
