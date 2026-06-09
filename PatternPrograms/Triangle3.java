package com.gqt;

import java.util.Scanner;

public class Triangle3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int k = 1; k <= n - i; k++) {
				System.out.print("  ");
			}
			for (int l = 1; l <= n - i; l++) {
				System.out.print("  ");
			}
			for (int m = 1; m <= i; m++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("* ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("  ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print("  ");
			}
			for(int m=1;m<=n-i;m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
//Output 
//Enter the number of rows : 5
//*                 * 
//* *             * * 
//* * *         * * * 
//* * * *     * * * * 
//* * * * * * * * * * 
//* * * *     * * * * 
//* * *         * * * 
//* *             * * 
//*                 * 
