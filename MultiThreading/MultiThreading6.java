package com.multithreading;

import java.util.Scanner;

class MThread121 implements Runnable {
	public synchronized void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " has entered bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " is using bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " has entered bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " has exited bathroom");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class MultiThreading6 {

	public static void main(String[] args) throws Exception {
		MThread121 m = new MThread121();
		Thread t1= new Thread(m);
		Thread t2= new Thread(m);
		Thread t3= new Thread(m);
		t1.setName("BOY");
		t2.setName("GIRL");
		t3.setName("OTHER");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
