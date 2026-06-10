package com.string;

class Student3 {
	int sid;
	String sname;
	boolean isGraduate;
	float percentage;
	char gender;

	public void m1() {
		System.out.println("Welcome to GQT");
	}
}

public class InstanceVariable {
	public static void main(String[] args) {
		Student3 s3 = new Student3();
		System.out.println(s3.sid);
		System.out.println(s3.sname);
		System.out.println(s3.percentage);
		System.out.println(s3.isGraduate);
		System.out.println(s3.gender);
		s3.m1();  
	}
}
