package com.info.StringPgmLogics;

import java.util.Arrays;

public class JoinArray {

	public static void main(String[] args) {
		
		int a1[]= {1,3},a2[]= {2};
		int b[]=new int[a1.length+a2.length];
		for(int i=0;i<a1.length;i++) {
			b[i]=a1[i];
		}
		for(int i=0;i<a2.length;i++) {
			b[a1.length+i]=a2[i];
		}
//		System.out.println(Arrays.toString(b));
		int temp=0;
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]>b[j]) {
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
//		System.out.println(Arrays.toString(b));
		int l=b.length;
//        System.out.println(l);
        int c=((l/2)+(l/2+1))/2;
        String v="";
        for(int i=1;i<=b[c]*b[c];i++) {
        	v=v+"0";
        }
        System.out.println(b[c]+"."+v);
	}

}
