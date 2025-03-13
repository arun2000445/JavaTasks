package com.info.StringPgmLogics;

import java.util.Arrays;

public class DemoWorks {

	public static void main(String[] args) {
//		String s="Java"; //Separate object create
//		s=s+" Program";
//		System.out.println(s);
		
		//Same memory allocation(Same Address)
//		String s="Hello";
//		String s1="Hello";
//		if(s==s1) {
//			System.out.println("Yes");
//		}
		
		//Different memory allocation
//		String s="Hello";
//		String s1=new String("Hello");
//		if(s==s1) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
//		//Equals
//		if(s.equals(s1)) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
		
		//SubString
//		String sub="Welcome";
//		System.out.println(sub.substring(0, 3));
		
		//ConCat
//		String fn="Arun";
//		System.out.println(fn.concat("Kannan"));
		
		//equals
//		String one="Hello";
//		String two="Hello";
//		if(one.equals(two)) {
//			System.out.println("Equal");
//		}
		
		//equalsIgnoreCase
//		String one="Hello";
//		String two="HEllo";
//		if(one.equalsIgnoreCase(two))System.out.println("Equal"); 
//		else System.out.println("Not Equal");
		
		//UpperCase & LowerCase
//		String up="ArunKannan";
//		System.out.println(up.toUpperCase());
//		System.out.println(up.toLowerCase());
		
		//trim
//		String t="  Hello  ";
//		System.out.println(t.trim());
		
		//Split
//		String s="abc,def";
//		System.out.println(Arrays.toString(s.split(",")));
		
		//replace
//		String re="AruN";
//		System.out.println(re.replace('N', 'n'));
		
		//String Buffer
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb.append(" Kannan")); 
	}

}
