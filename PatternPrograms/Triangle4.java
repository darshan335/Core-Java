package com.gqt;

import java.util.Scanner;

public class Triangle4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
//Output
//Enter the number of rows : 5
//* * * * * 
//  * * * * 
//    * * * 
//      * * 
//        * 
