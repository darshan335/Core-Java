package com.methods;

class methodOverLoading2 {
	public int add(int a, int b) {
		return a + b;
	}

	public float add(int a, float b) {
		return a + b;
	}

	public double add(float a, float b) {
		return a + b;

	}

	public float add(int a, int b, float c) {
		return a + b + c;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		methodOverLoading2 m1 = new methodOverLoading2();
		System.out.println(m1.add(2, 3));
		System.out.println(m1.add(43.5f, 54.6f));
		System.out.println(m1.add(4, 50, 5.5f));
	}

}
//Output
//------
//5
//98.0999984741211
//59.5
