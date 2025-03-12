package com.info.ArrayPgmLogics;

import java.util.Arrays;

public class DesendingOrder {

	public static void main(String[] args) {
		
		int a[] = { 9, 2, 1, 5, 6 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
//					System.out.println(Arrays.toString(a));
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
