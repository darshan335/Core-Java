package com.encapsulation;

import java.util.Scanner;

class ATM {
	private int accNumber = 2222;
	private int pass = 4444;
	Scanner scan = new Scanner(System.in);

	public void setAccNumber(int an) {
		System.out.print("Enter old account number : ");
		int a = scan.nextInt();
		if (a == accNumber) {
			accNumber = an;
			System.out.println("Account number changed successfully");
		} else {
			System.out.println("Invalid account number");
			System.exit(0);
		}
	}

	public void setPassword(int passwld) {
		System.out.print("Enter old password : ");
		int pwd = scan.nextInt();
		if (pwd == pass) {
			pass = passwld;
			System.out.println("Password changed successfully");
		} else {
			System.out.println("Invalid password try again");
			System.exit(0);
		}
	}

	public int getAccNumber() {
		return accNumber;
	}

	public int getPassword() {
		return pass;
	}

}

public class Encapsulation1 {

	public static void main(String[] args) {
		ATM a1 = new ATM();
		a1.setAccNumber(9110);
		a1.setPassword(4388);
		System.out.println("Modified account number : " + a1.getAccNumber());
		System.out.println("Modified password : " + a1.getPassword());

	}

}
//Output
//Enter old account number : 2222
//Account number changed successfully
//Enter old password : 4444
//Password changed successfully
//Modified account number : 9110
//Modified password : 4388
