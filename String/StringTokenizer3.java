//Accept a sentence from the user. check whether it contains odd number of words or even no. display proper msg
package com.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sentence : ");
		int count = 0;
		String str = scan.nextLine();
		StringTokenizer stk = new StringTokenizer(str, " ");
		while (stk.hasMoreTokens()) {
			stk.nextElement();
			count++;
		}
		if (count % 2 == 0)
			System.out.println("The given sentence has even number of words");
		else
			System.out.println("The given sentence has odd number of words");
	}

}
//Output
//Enter a sentence : hi hello luv u
//The given sentence has even number of words
