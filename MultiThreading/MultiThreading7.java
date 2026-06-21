package com.multithreading;

class Bathroom implements Runnable {
	public synchronized void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " has entered bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " is using bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " has exited bathroom");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class MultiThreading7 {

	public static void main(String[] args) {
		Bathroom b = new Bathroom();
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);
		t1.setName("BOY");
		t2.setName("GIRL");
		t3.setName("OTHER");
		t1.start();
		t2.start();
		t3.start();

	}

}
