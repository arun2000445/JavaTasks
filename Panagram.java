package com.info.StringPgmLogics;

public class Panagram {

	public static void main(String[] args) {

		String a = "Abcdefghijklmnopqrstuvwxyz";
		a = a.toLowerCase();
		String b = "Google";
		b = b.toLowerCase();
		int c = 0;
//		System.out.println(a.length());
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if (a.charAt(i) == b.charAt(j)) {
					c++;
					break;
				}
			}
		}
		if (a.length() == c) {
			System.out.println("Panagram");
		} else {
			System.out.println("Not Panagram");
		}
	}

}
