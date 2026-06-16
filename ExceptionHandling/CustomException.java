package com.exceptionhandling;

import java.util.Scanner;

class InvalidAmountException extends Exception {
	public String getMessage() {
		return "Please enter valid amount";
	}
}

public class CustomException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter amount to be withdrawn : ");
			int amount = scan.nextInt();
			if (amount > 0 && amount % 500 == 0) {
				System.out.println("Collect your cash");
			} else {
				InvalidAmountException iae = new InvalidAmountException();
				throw iae;
			}
		} catch (InvalidAmountException iae) {
			System.out.println(iae.getMessage());
		}
	}

}
