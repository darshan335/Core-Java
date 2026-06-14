package com.polymorphism;

class Vehicle {
	public void checkAirPressure() {
		System.out.println("Check air pressure before journey");
	}

	public void getNumberOfWheels() {
		System.out.println("Normally vehicle has 4 wheels");
	}

	public void startEngine() {
		System.out.println("Insert a key and start engine");
	}
}

class Car extends Vehicle {
	public void getNumberOfWheels() {
		System.out.println("Normally car has 4+1 wheels");
	}
}

class Bus extends Vehicle {
	public void getNumberOfWheels() {
		System.out.println("Normally bus has 6+1 wheels");
	}
}

class Bicycle extends Vehicle {
	public void getNumberOfWheels() {
		System.out.println("Normally cycle has 2 wheels");
	}

	public void startEngine() {
		System.out.println("Normally cycle has no engine");
	}
}

public class Polymorphism1 {

	public static void main(String[] args) {
		Vehicle v = new Bus();
		v.checkAirPressure();
		v.getNumberOfWheels();
		v.startEngine();
		v=new Car();
		v.checkAirPressure();
		v.getNumberOfWheels();
		v.startEngine();
		v=new Bicycle();
		
	}

}
