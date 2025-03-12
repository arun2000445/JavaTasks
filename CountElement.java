package com.info.ArrayPgmLogics;

public class CountElement {

	public static void main(String[] args) {
		
		int a[] = { 10, 20, 30, 40, 20, 40, 10, 50 };
		int b[] = { 10, 20, 30, 40, 20, 40, 10, 50 };
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			c = 0;
			if (a[i] != 0) {
				System.out.print(a[i] + "-");
				for (int j = 0; j < b.length; j++) {
					if (a[i] == b[j]) {
						c++;
					}
				}
				System.out.println(c);
			}
		}

	}

}
