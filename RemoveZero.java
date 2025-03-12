package com.info.ArrayPgmLogics;

import java.util.Arrays;

public class RemoveZero {

	public static void main(String[] args) {

		int a[] = { 1, 4, 3, 0 };
		int b[] = { 1, 4, 3 };
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];

		}
		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];

		}
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 0) {
				count++;
			}
		}

		count = 0;

		for (int i = 0; i < c.length; i++) {
			if (c[i] != 0) {
				count++;
			}
		}
//		System.out.println(count);
		int[] d = new int[count];
		int z = 0;
		for (int i = 0; i < c.length; i++) {

			if (c[i] != 0) {

				d[z] = c[i];
				z++;
			}

		}

		System.out.println(Arrays.toString(d));

	}

}
