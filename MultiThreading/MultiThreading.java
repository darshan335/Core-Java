package com.multithreading;

public class MultiThreading {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		
		//Modifing Priority
		Thread.currentThread().setPriority(8);
		System.out.println("Modified priority = "+Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread());
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		//MOdifing name
		Thread.currentThread().setName("Darshan");
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
	}

}
