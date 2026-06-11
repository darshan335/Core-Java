package com.methods;

import java.util.Scanner;
class Method4{
	public int add(int a, int b) {
		return a+b;
	}
}
public class InputOutputMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a = scan.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = scan.nextInt();
		Method4 m1 = new Method4();
		int sum=m1.add(a, b);
		System.out.println("Sum = "+sum);
	}

}
//Output
//Enter 1st number : 2
//Enter 2nd number : 7
//Sum = 9
