package com.info.ArrayPgmLogics;

public class SmallBig {

	public static void main(String[] args) {

		// Biggest
		int arr[] = { 10, 20, 30, 40, 50 };
		int val = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (val < arr[i]) {
				val = arr[i];
			}
		}
		System.out.println("Biggest Value:" + val);

		// Smallest
		int demoVal = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (demoVal > arr[i]) {
				demoVal = arr[i];
			}
		}
		System.out.println("Smallest Value:" + demoVal);
	}

}
