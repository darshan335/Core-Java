package com.string;

public class ImmutableString {

	public static void main(String[] args) {
		String s1 = "Rama";
		String s2 = "Rama";
		if (s1 == s2)
			System.out.println("References are equal");
		else
			System.out.println("References are not equal");
		// -----------------------------------------------
		if (s1.equals(s2))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");

	}

}
