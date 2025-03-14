package com.info.StringPgmLogics;

public class ArrayString {

	public static void main(String[] args) {
		
		String a[] = { "flower", "flow", "flight" };
		String value = "fl";
		String empty = "";
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			empty = "";
			String fl = a[i];
			for (int j = 0; j < value.length(); j++) {
				empty += fl.charAt(j);
				if (empty.equals("fl")) {
					c++;
				}
			}
//			System.out.println(empty);
		}
		if (a.length == c) {
			System.out.println(empty);
		}
	}

}
