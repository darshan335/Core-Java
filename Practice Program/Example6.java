//Example : 6 Accept any character from the keyboard and print its ASCII Value
package com.gqt;

import java.util.Scanner;

public class Example6 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any character : ");
		int ch =scan.next().charAt(0);
		System.out.println("ASCII Value = "+ch);
	}

}
//Output
//-----------
//Enter any character : a
//ASCII Value = 97
