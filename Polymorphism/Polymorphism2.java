package com.polymorphism;

class Vehicle1 {
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

class Car1 extends Vehicle1 {
	public void getNumberOfWheels() {
		System.out.println("Normally car has 4+1 wheels");
	}
}

class Bus1 extends Vehicle1 {
	public void getNumberOfWheels() {
		System.out.println("Normally bus has 6+1 wheels");
	}
}

class Bicycle1 extends Vehicle1 {
	public void getNumberOfWheels() {
		System.out.println("Normally cycle has 2 wheels");
	}

	public void startEngine() {
		System.out.println("Normally cycle has no engine");
	}
}

class Flexible {
	public void polymorphic(Vehicle1 v) {
		v.checkAirPressure();
		v.getNumberOfWheels();
		v.startEngine();
		System.out.println();
	}
}

public class Polymorphism2 {

	public static void main(String[] args) {
		Flexible f = new Flexible();
		f.polymorphic(new Car1());
		f.polymorphic(new Bus1());
		f.polymorphic(new Bicycle1());
	}

}
