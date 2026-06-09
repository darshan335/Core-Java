//Example:2 Accept 5 digits and find the sum of the square of array elements
package com.gqt;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		System.out.print("Enter 5 elements : ");
		int sumOfArray = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
			System.out.print(a[i] + " ");
			sumOfArray += a[i];

		}
		int square = sumOfArray * sumOfArray;
		System.out.println("\nSum of Square of the array is : " + square);
		if (square % 4 == 0) {
			System.out.println(square + " is Divisible by 4");
		} else {
			System.out.println(square + " is not Divisible by 4");
		}

	}

}
//Output
//Enter 5 elements : 1 2 3 4 5
//1 2 3 4 5 
//Sum of Square of the array is : 225
//225 is not Divisible by 4
