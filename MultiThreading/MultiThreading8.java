package com.multithreading;

class Person extends Thread {
	String res1 = "Knowledge";
	String res2 = "Money";

	public void run() {
		if (Thread.currentThread().getName().equals("TEACHER")) {
			teacherAccResource();
		} else {
			studentAccResource();
		}
	}

	public void teacherAccResource() {
		try {
			synchronized (res1) {
				System.out.println("Teacher has acquired and locked" + res1 + "Resource..");
				Thread.sleep(5000);
				synchronized (res2) {
					System.out.println("Teacher has acquired and locked" + res2 + "Resource");
					Thread.sleep(5000);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void studentAccResource() {
		try {
			synchronized (res1) {
				System.out.println("Student has acquired and locked" + res1 + "Resource");
			}
			Thread.sleep(5000);
			synchronized (res2) {
				System.out.println("student has acquired and locked" + res2 + "Resource");
				Thread.sleep(5000);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class MultiThreading8 {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		p1.setName("TEACHER");
		p2.setName("STUDENT");
		p1.start();
		p2.start();
		
	}

}
