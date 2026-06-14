package com.abstraction;

abstract class Vehicle4 {
	public void startEngine() {
		System.out.println("Start the engine");
	}

	abstract public void getNumberOfWheels();

	public void checkAirPressure() {
		System.out.println("Check air pressure before journey");
	}
}

class Bus4 extends Vehicle4 {
	public void getNumberOfWheels() {
		System.out.println("Normally bus has 6+1 wheels");
	}
}

class Car4 extends Vehicle4 {
	public void getNumberOfWheels() {
		System.out.println("Normally car has 4+1 wheels");
	}
}

class Bicycle4 extends Vehicle4 {
	public void getNumberOfWheels() {
		System.out.println("Normally cycle has 2 wheels");
	}

	public void startEngine() {
		System.out.println("cycle has no engine");
	}
}
class Flexible {
	Flexible(Vehicle4 v) {
		v.checkAirPressure();
		v.getNumberOfWheels();
		v.startEngine();
		System.out.println();
		System.out.println("--------------------");
	}
}

public class Abstraction2 {

	public static void main(String[] args) {
		Flexible f = new Flexible(new Bus4());
		Flexible f1 = new Flexible(new Car4());
		Flexible f2 = new Flexible(new Bicycle4());
		
	}

}
