package com.info.ArrayPgmLogics;

public class DupicateElement {

	public static void main(String[] args) {
		
		int[] a= {10,20,30,10,40,30,50,20};
		int b[]=new int [a.length];
		for(int i=0;i<a.length;i++) { 
			b[i]=a[i];
			
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
//		for(int i=0;i<b.length;i++) {
//			System.out.println(b[i]);
//		}
	}

}
