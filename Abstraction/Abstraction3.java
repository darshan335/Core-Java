package com.abstraction;

import java.util.Scanner;

abstract class Shape {
	float area;

	abstract public void acceptInput();

	public abstract void computeArea();

	public void display() {
		System.out.println("Area = " + this.area);
	}
}

final class Rectangle extends Shape {
	int l;
	int b;

	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length : ");
		l = scan.nextInt();
		System.out.print("Enter breadth : ");
		b = scan.nextInt();

	}

	public void computeArea() {
		area = l * b;
	}
}

final class Square extends Shape {
	int l;

	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length : ");
		l = scan.nextInt();

	}

	public void computeArea() {
		area = l * l;
	}
}
class Flexible1 {
	Flexible1(Shape s) {
		s.acceptInput();
		s.computeArea();
		s.display();
	}
}

public class Abstraction3 {

	public static void main(String[] args) {
		Flexible1 f = new Flexible1(new Square());
		Flexible1 f1 = new Flexible1(new Rectangle());
	}

}
