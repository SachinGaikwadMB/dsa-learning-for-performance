package com.mb.dsa.strings;

public class Palimdrome {
	public static void main(String[] args) {
		String str = "abcdcba";//yes palimdrome
		String str2 = "aba";//yes palimdrome
		String st1 = "";
		
		System.out.println(palimdrome(st1));
	}
	
	public static  boolean palimdrome(String str) {
		
		if(str == null || str.length() == 0) {
			return false;
		}
		
		int start = 0;
		int end = str.length()-1;
		
		while(start++ < end--) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
//			start++;
//			end--;
		}
		
		return true;
	}
}

