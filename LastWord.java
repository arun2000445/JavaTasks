package com.info.StringPgmLogics;

public class LastWord {

	public static void main(String[] args) {
		
		String s = "inbuilt method used to set the length of the character sequence";
		char[] c = s.toCharArray();

		int d = 0, index = 0;
//		System.out.println(Arrays.toString(c));
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				index = i;

			}
//			d++;
		}
//		System.out.println(index);
//		System.out.println(s.length());
		char[] z = new char[(c.length - 1) - index];
		int y = 0;
		for (int j = index + 1; j < c.length; j++) {
			z[y] = c[j];
			y++;
		}
//		System.out.println(Arrays.toString(z));
		String x = "";
		for (int k = 0; k < z.length; k++) {
			x = x + z[k];
		}
		System.out.println(x);

	}

}
