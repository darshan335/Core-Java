package com.encapsulation;

class Student1 {
	private int id;
	private String name;
	private String course;
	private float fees;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


}

public class Encapsulation3 {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
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
//Output
//10
//Darshan
//Bengaluru
//Java fullstack
//28500.0
