// Example : 4 Accept any uppercase alphabet and print by converting into lower case and also attach hi
package com.gqt;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any uppercase alphabet : ");
		char ch = scan.next().charAt(0);
		System.out.println("Hi "+ Character.toLowerCase(ch));
	}

}
//-----------------------
//Output
//-----------------------
//Enter any uppercase alphabet : A
//Hi a
