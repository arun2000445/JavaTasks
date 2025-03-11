package com.info.ArrayPgmLogics;

public class DecArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int b[]= {60,70,80,90,100};
		System.out.print("[");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[a.length-1-i]+","+b[b.length-1-i]);
			if(i!=b.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

}
