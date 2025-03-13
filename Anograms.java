package com.info.StringPgmLogics;

public class Anograms {

	public static void main(String[] args) {

		String a = "arun";
		String b = "unar";
		int c = 0;
		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				for (int j = 0; j < b.length(); j++) {
					if (a.charAt(i) == b.charAt(j)) {
						c++;
						break;
					}
				}
			}
			if (c == a.length()) {
				System.out.println("Anogram");
			} else {
				System.out.println("Not Anogram");
			}

		} else {
			System.err.println("Available For Extra Characters!!!");
		}
	}

}
