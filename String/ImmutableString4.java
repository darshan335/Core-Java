package com.string;

public class ImmutableString4 {

	public static void main(String[] args) {
		String s1= "Rama";
		String s2= new String("rama");
		if(s1.equals(s2))
			System.out.println("String is equal");
		else
			System.out.println("String is not equal");
		//--------------------------
		if(s1.equalsIgnoreCase(s2))
			System.out.println("String is equal");
	}

}
