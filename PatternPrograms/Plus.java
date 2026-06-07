package com.gqt;

import java.util.Scanner;

public class Plus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == (n + 1) / 2 || j == (n + 1) / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
//Output
//----------
//Enter number of rows : 5
//      *   
//      *	
//  * * * * *
//      *
//      *
