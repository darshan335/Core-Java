
//Example : 1 Accept 5 city names from the user and print the city names and no.of charcters of the city name
package com.gqt;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] city = new String[5];
		System.out.print("Enter 5 city names : ");
		for (int i = 0; i < city.length; i++) {
			city[i] = scan.next();

		}
		System.out.println("City Names\tCharacters");
		System.out.println("----------\t----------");
		for (String x : city) {
			System.out.println(x + "\t\t" + x.length());
		}

	}

}
//Output
//-------
//Enter 5 city names : Bengaluru
//Mysuru
//Kunigal
//Tumakuru
//Mumbai
//City Names	Characters
//----------	----------
//Bengaluru		9
//Mysuru		6
//Kunigal		7
//TUmakuru		8
//Mumbai		6

