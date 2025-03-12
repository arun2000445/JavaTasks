package com.info.ArrayPgmLogics;

import java.util.Arrays;

public class SplitAdd {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3 };
		int b = a.length;
		int m = 1;
		for (int i = 1; i <= a.length; i++) {

			m = m * 10;
		}
		int value = m / 10;
		int add = 0;
//		System.out.println(value);
		for (int i = 0; i < a.length; i++) {
			add += a[i] * value;
			value /= 10;
		}
		int index = 0;
		int arr[] = new int[a.length];
		int finalValue = add + 1;
//		System.out.println(finalValue);
		for (int i = 0; finalValue > 0; finalValue /= 10) {
			int re = finalValue % 10;
			arr[index] = re;
			index++;
		}
//		System.out.println(Arrays.toString(arr));
		int d[] = new int[a.length];
		for (int i = 0; i < arr.length; i++) {
			d[i] = arr[arr.length - i - 1];
		}
		System.out.println(Arrays.toString(d));
	}

}
