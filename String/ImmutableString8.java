package com.string;

public class ImmutableString8 {

	public static void main(String[] args) {
		String s1="TarakaRama";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.startsWith("Tara"));
		System.out.println(s1.endsWith("Rama"));
		System.out.println(s1.charAt(0));
		System.out.println(s1.indexOf('R'));
		System.out.println(s1.lastIndexOf('R'));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,6));
		System.out.println(s1.replaceAll("a", "f"));
		
	}

}
