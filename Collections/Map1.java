package com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Student230 {
	private String name;
	private String course;
	private float percentage;
	private String city;

	public Student230(String name, String course, float percentage, String city) {
		super();
		this.name = name;
		this.course = course;
		this.percentage = percentage;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public float getPercentage() {
		return percentage;
	}

	public String getCity() {
		return city;
	}

	public String toString() {
		return name + " " + " " + percentage + " " + city;
	}
}

public class Map1 {

	public static void main(String[] args) {
		Student230 s1 = new Student230("Darshan","Java", 97.4f, "Bengaluru");
		Student230 s2 = new Student230("Ravi","Java", 97.4f, "Bengaluru");
		Student230 s3 = new Student230("Pandu","Java", 97.4f, "Bengaluru");
		//Using Tree Map
		TreeMap<Integer, Student230> tm = new TreeMap<>();
		tm.put(47, s1);
		tm.put(48, s2);
		tm.put(49, s3);
		System.out.println(tm);
		//Using HashMap
		HashMap<Integer, Student230> hm = new HashMap<>();
		hm.put(100, s1);
		hm.put(101, s2);
		hm.put(102, s3);
		System.out.println(hm);
		//Using Linked HashMap
		LinkedHashMap<Integer, Student230> lm = new LinkedHashMap<>();
		lm.put(100, s1);
		lm.put(101, s2);
		lm.put(102, s3);
		System.out.println(lm);
		lm.forEach((i,j)-> System.out.println(i+" : "+j));
		
	}

}
