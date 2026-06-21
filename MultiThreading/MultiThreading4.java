package com.multithreading;

import java.util.Scanner;

public class MultiThreading4 {

	public static void main(String[] args)throws InterruptedException {
		//Banking Activity
		System.out.println("Banking activity started..");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter user id : ");
		int userId=scan.nextInt();
		System.out.print("Enter Password : ");
		int pass=scan.nextInt();
		Thread.sleep(5000);
		System.out.println("Collect your money..");
		System.out.println("Banking activity completed..");
		
		//Printing Activity
		System.out.println("printing activity started");
		for(int i=1;i<=5;i++) {
			System.out.println("GQT");
			Thread.sleep(5000);
		}
		System.out.println("Printing Activity completed");
		//Adding Activity
		System.out.println("Adding Activity");
		int a = 6688;
		int b= 87870;
		Thread.sleep(5000);
		System.out.println("Balance = "+(a+b));
	}

}
