
//Example 1: Accept a sentence from the user. count the number of words in that sentence
package com.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer2 {

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
		System.out.print("Number of words in the given sentence is : " + count);

	}
}
//Output
//Enter a sentence : hi hello bye
//Number of words in the given sentence is : 3
