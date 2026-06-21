package com.multithreading;
class MThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Thread is executing run method");
	}
}
public class MultiThreading2 {

	public static void main(String[] args) {
		MThread m = new MThread();
		m.setName("DThread");
		m.start();
		m.run();
	}

}
