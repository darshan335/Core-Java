package com.gqt;

import java.util.Scanner;

public class LeftAngleTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int k = 0; k <= n - i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
//Output
//-------
//Enter the number of rows : 5
//* * * * * 
//* * * * 
//* * * 
//* * 
//* 

