package com.gqt;

import java.util.Scanner;

public class RightAngleTriangleNumber3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = scan.nextInt();
		int count = 1;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}

}
//Output
//----------
//Enter the number of rows : 5
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 
