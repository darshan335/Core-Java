package com.encapsulation;

class GirlsCollege {
	private int id;
	private String name;
	private String course;
	static char gender = 'F';

	public GirlsCollege(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		
	}

	public String toString() {
		return id + "\n" + name + "\n" + course + "\n" + gender;
	}
}

public class StaticVariable {

	public static void main(String[] args) {
		GirlsCollege g = new GirlsCollege(10, "Ashwini", "CSE");
		System.out.println(g);
		GirlsCollege g1 = new GirlsCollege(20, "Venkatamma", "ECE");
		System.out.println(g);
		System.out.println(g1);
		//Accessing static variables using object ref
		System.out.println(g.gender);
		//Accessing static variables using class name
		System.out.println(GirlsCollege.gender);
		//Accessing instance variable using class name
		//System.out.println(GirlsCollege.id);//error
	}

}
//10
//Ashwini
//CSE
//F
//20
//Venkatamma
//ECE
//F
//F
//F

