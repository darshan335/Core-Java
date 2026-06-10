package com.string;

public class ImmutableString3 {

	public static void main(String[] args) {
		String s1= "Rama";
		String s2= new String("Rama");
		if(s1==s2)
			System.out.println("References are equal");
		else
			System.out.println("References are not equal");
	}

}
