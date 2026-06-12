package com.encapsulation;

class Student {
	private int id;
	private String name;
	private String course;
	private float fees;
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		course = course;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		fees = fees;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		city = city;
	}

}

public class Encapsulation2 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(10);
		s1.setName("Darshan");
		s1.setCity("Bengaluru");
		s1.setCourse("Java fullstack");
		s1.setFees(28500);
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getCity());
		System.out.println(s1.getCourse());
		System.out.println(s1.getFees());
	}

}
//Shadowing problem
//0
//null
//null
//null
//0.0
