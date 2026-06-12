package com.encapsulation;

class Student2 {
	private int id;
	private String name;

	public Student2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Student2() {

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}

public class Constructor {

	public static void main(String[] args) {
		Student2 s1 = new Student2();
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		Student2 s2 = new Student2(10,"Ravi");
		System.out.println(s2.getId());
		System.out.println(s2.getName());
	}

}
//Output
//0
//null
//10
//Ravi