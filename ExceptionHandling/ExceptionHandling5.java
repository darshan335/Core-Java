package com.exceptionhandling;

public class ExceptionHandling5 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println("handled");
			System.exit(0);
		}
		finally {
			System.out.println("bye bye");
		}
	}

}
