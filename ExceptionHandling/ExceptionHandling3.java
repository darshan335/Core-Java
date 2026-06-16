package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling3 {

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter numerator : ");
			int a = scan.nextInt();
			System.out.print("Enter denominator : ");
			int b = scan.nextInt();
			int sum = a / b;
			System.out.println("Sum = "+sum);
			System.out.print("Enter array size : ");
			int size = scan.nextInt();
			int[] arr = new int[size];
			System.out.println("Array with the size " + size + " created successfully");
			System.out.print("Enter element to be stored in an array : ");
			int element = scan.nextInt();
			System.out.print("Enter position to store array element : ");
			int position = scan.nextInt();
			arr[position] = element;
			System.out.println(element + " inserted successfully");
		}catch(InputMismatchException ie) {
			System.out.println("Enter integer numbers only");
		}catch(ArithmeticException ae) {
			System.out.println("Numerator should not be zero");
		}catch(NegativeArraySizeException ne) {
			System.out.println("Dont enter negative size");
		}catch(ArrayIndexOutOfBoundsException aoe) {
			System.out.println("Dont enter out of size position");
		}catch(Exception e) {
			System.out.println("Some problem occured");
		}
		System.out.println("Connection terminated");
		
	}

}
