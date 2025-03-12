package com.info.ArrayPgmLogics;

public class MissingPositiveValue {

	public static void main(String[] args) {
		
		int a[]= {3,4,-1,1};
		int len=a.length;
		int sum=0,neg=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				neg-=a[i];
			}
		}
//		System.out.println(sum);
		int mvalue=(len*(len+1))/2-sum-neg;
		System.out.println("Missing Positive Value:"+mvalue);

	}

}
