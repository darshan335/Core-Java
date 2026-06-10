package com.string;

public class immutableString5 {

	public static void main(String[] args) {
		String s1 = "Rama";
		String s2 = "Sita";
		String s3 = "Rama"+"Sita";
		String s4 = "Rama"+"Sita";
		if(s3==s4)
			System.out.println("References are equal");
		else
			System.out.println("References are not equal");
	}

}
