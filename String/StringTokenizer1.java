package com.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) {
		String str = "Hi , Hello Byee.. How are you";
		StringTokenizer stk = new StringTokenizer(str, "o");
		while (stk.hasMoreElements()) {
			System.out.println(stk.nextToken());
		}

	}

}
//Output
//Hi , Hell
//Byee.. H
//w are y
//u