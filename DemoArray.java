package com.info.ArrayPgmLogics;

public class DemoArray {

	public static void main(String[] args) {
		
		//Static Way
		int i[]= {10,20,30,40,50};
		int len=i.length,s=0,mul=1;
//		System.out.println("Length:"+len);
//		System.out.println(i[3]);
//		System.out.println(i[5]);
		for(int a=0;a<len;a++) {
			s+=i[a];
			
		}
		System.out.println(s);
		
		//Mul
//		System.out.print(i);
		System.out.print("{");
		for(int a=0;a<len;a++) {
			mul=i[a]*2;
//			b[]=mul;
			System.out.print(mul);
			if(a<len-1) {
				System.out.print(",");	
			}
			
		}
		System.out.print("}");
	}

}
