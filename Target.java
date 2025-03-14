package com.info.StringPgmLogics;

import java.util.Arrays;

public class Target {

	public static void main(String[] args) {

		int a[] = { 3, 2, 4 };
		int target = 6, sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
//		System.out.println(sum);
		target = sum - target;
//		System.out.println(target);
		int b[] = new int[target - 1];
		int y = 0;
		for (int i = 1; i < target; i++) {
			b[y] = i;
			y++;
		}
		System.out.println(Arrays.toString(b));
	}

}
