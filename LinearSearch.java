package com.info.ArrayPgmLogics;

public class LinearSearch {

	public static void main(String[] args) {

		int a[] = { 10, 20, 40, 60 };
		int t = 40;
		for (int i = 0; i < a.length; i++) {
			if (t == a[i]) {
				System.out.println(i);
			}
		}

	}

}
