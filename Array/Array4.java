//Accept any 10 uppercase alphabets and print the corresponding lowercase alphabets along with its ASCII Value
package com.gqt;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any 10 uppercase alphabet : ");
		char[] ch = new char[10];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = scan.next().charAt(0);

		}
		for (char x : ch) {
			System.out.println(
					x + " -----> " + Character.toLowerCase(x) + " ASCII -----> " + (int) (Character.toLowerCase(x)));
		}

	}

}
//Output
//Enter any 10 uppercase alphabet : A B C D E F G H I J K L
//A -----> a ASCII -----> 97
//B -----> b ASCII -----> 98
//C -----> c ASCII -----> 99
//D -----> d ASCII -----> 100
//E -----> e ASCII -----> 101
//F -----> f ASCII -----> 102
//G -----> g ASCII -----> 103
//H -----> h ASCII -----> 104
//I -----> i ASCII -----> 105
//J -----> j ASCII -----> 106
