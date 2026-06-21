package com.multithreading;

import java.util.Scanner;

class MThread12 implements Runnable {
	public void run() {
		if (Thread.currentThread().getName().equals("BANK")) {
			banking();
		} else if (Thread.currentThread().getName().equals("PRINT")) {
			printing();
		} else
			adding();
	}

	public void banking() {
		try {
			// Banking Activity
			System.out.println("Banking activity started..");
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter user id : ");
			int userId = scan.nextInt();
			System.out.print("Enter Password : ");
			int pass = scan.nextInt();
			Thread.sleep(5000);
			System.out.println("Collect your money..");

		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("Banking activity completed..");
	}

	public void printing() {
		try {
			// Printing Activity
			System.out.println("printing activity started");
			for (int i = 1; i <= 5; i++) {
				System.out.println("GQT");
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Printing Activity completed");

	}

	public void adding() {
		try {
			// Adding Activity
			System.out.println("Adding Activity");
			int a = 6688;
			int b = 87870;
			Thread.sleep(5000);
			System.out.println("Balance = " + (a + b));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class MultiThreading5 {

	public static void main(String[] args) throws Exception {
		MThread12 m = new MThread12();
		MThread12 m1 = new MThread12();
		MThread12 m2= new MThread12();
		
		Thread t = new Thread(m);
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		t.setName("BANK");
		t1.setName("PRINT");
		t2.setName("ADD");
		t.start();
		t.join();
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		System.out.println(t2.isAlive());
	}

}
