package com.gqt;

import java.util.Scanner;

public class RightAngleTriangleAlphabet2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print((char)(i+64) + " ");

			}
			System.out.println();
		}
	}

}
//Output
//----------
//Enter the number of rows : 5
//A 
//B B 
//C C C 
//D D D D 
//E E E E E 
