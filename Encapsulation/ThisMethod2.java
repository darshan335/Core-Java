package com.encapsulation;

class Book {
	private int bookId;
	private String bookName;

	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		System.out.println("Two parameterized constructor");
	}

	public Book() {
		super();
		System.out.println("Zero parameterized");
	}

	public Book(int bookId) {
		this();
		System.out.println("1 parameterized");

	}

}

public class ThisMethod2 {

	public static void main(String[] args) {
		Book b = new Book(20);
		Book b2 = new Book(10, "Cooking");
		Book b3 = new Book();
	}

}
