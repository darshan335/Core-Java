package com.gqt;

import java.util.Scanner;

public class Triangle10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = scan.nextInt();
		for (int i = 1; i <= n - 1; i++) {
			for (int k = 1; k <= n - i + 1; k++) {
				System.out.print("  ");
			}
			if (i == 1) {
				System.out.print("*");
			} else {
				System.out.print("* ");
				for (int l = 1; l <= 2 * i - 3; l++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print("  ");
			}
			if (i == n) {
				System.out.print("* ");
			} else {
				System.out.print("* ");
				for (int l = 1; l <= 2 * (n - i) - 1; l++) {
					System.out.print("  ");
				}

				System.out.print("* ");

			}
			System.out.println();

		}
	}

}
//Output
//Enter the number of rows : 5
//         *
//       *   * 
//     *       * 
//   *           * 
// *               * 
//   *           * 
//     *       * 
//       *   * 
//         * 
