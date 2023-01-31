package com.mb.dsa.strings;

public class ReverseString {

	public static void main(String[] args) {

		String str = "sachin from sggs";
		System.out.println(str);
		 
		System.out.println(reverseString(str));
	}
	
	public static String reverseString(String str) {
		//String is immutable so that we can not modify 

		String rs = "";
		
		for(int idx = str.length()-1; idx>=0; idx--) {
			rs = rs + str.charAt(idx); 
		}
		return rs;
		
	}
	

}
