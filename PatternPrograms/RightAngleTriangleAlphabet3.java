package com.gqt;

import java.util.Scanner;

public class RightAngleTriangleAlphabet3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print((char)(k+64) + " ");

			}
			System.out.println();
		}
	}

}
//Output
//---------
//Enter the number of rows : 5
//A 
//A B 
//A B C 
//A B C D 
//A B C D E 
