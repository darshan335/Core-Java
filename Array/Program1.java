package com.gqt;

class Dog {
	String name;
	String breed;
	int cost;

	public void bark() {
		System.out.println("Dog is barking");
	}

	public void eat() {
		System.out.println("Dog is eating");
	}

	public void sleep() {
		System.out.println("Dog is sleeping");
	}
}

public class Program1 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.bark();
		d1.eat();
		d1.sleep();
		System.out.println("First Dog details");
		System.out.println("------------------");
		System.out.println(d1.name);
		System.out.println(d1.cost);
		System.out.println(d1.breed);
		d1.name = "Bruno";
		d1.cost = 12_250;
		d1.breed = "Labrador";
		System.out.println("------------------");
		System.out.println(d1.name);
		System.out.println(d1.cost);
		System.out.println(d1.breed);
		System.out.println(d1.hashCode());
		System.out.println("------------------");
		Dog d2 = new Dog();
		d2.bark();
		d2.eat();
		d2.sleep();
		System.out.println("Second Dog details");
		System.out.println("------------------");
		System.out.println(d2.name);
		System.out.println(d2.cost);
		System.out.println(d2.breed);
		System.out.println(d2.hashCode());
		d2.name = "Puppy";
		d2.cost = 15_540;
		d2.breed = "pug";
		System.out.println("------------------");
		System.out.println(d2.name);
		System.out.println(d2.cost);
		System.out.println(d2.breed);

	}

}
