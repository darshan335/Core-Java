package com.multithreading;
class MThread2 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Thread is implementing runnable interface");
	}
}
public class MultiThreading3 {

	public static void main(String[] args) {
			MThread2 m = new MThread2();
			Thread t = new Thread(m);
			t.setName("Ash");
			t.run();
			m.run();
			t.start();

	}

}
