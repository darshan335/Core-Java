package com.gqt;

import java.util.Scanner;

public class Triangle9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of row : ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++) {
				System.out.print("  ");
			}

			if (i == 1) {
				System.out.print("* ");
			} else {
				System.out.print("* ");
				for (int j = 1; j <= 2 * i - 3; j++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}

			System.out.println();
		}

	}
}
//Output
//Enter the number of row : 5
//         * 
//       *   * 
//     *       * 
//   *           * 
// *               * 
