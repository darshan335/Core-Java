package com.gqt;

import java.util.Scanner;

public class RightAngleTriangleNumber2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <=i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
//Output
//Enter the number of rows : 5
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 

