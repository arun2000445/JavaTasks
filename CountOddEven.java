package com.info.ArrayPgmLogics;

public class CountOddEven {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 15, 17, 65 };
		int odd = 0, even = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Count of Odd Numbers:" + odd);
		System.out.println("Count of Even Numbers:" + even);
	}

}
