package com.info.StringPgmLogics;

import java.util.Scanner;

public class Palindrom {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Check The Given String is Palindrom or Not:-");
		System.out.println("Enter a String:");
		String txt = sc.next();
		String s = txt.toLowerCase();
		String empty = "";
//		System.out.println(s.length());
		for (int i = s.length() - 1; 0 <= i; i--) {
			empty += s.charAt(i);
		}
//		System.out.println(empty);
		if (s.equals(empty)) {
			System.out.println(txt + " is a Palindrome");
		} else {
			System.out.println(txt + " is a Not Palindrome");
		}
	}

}
