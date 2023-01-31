package com.mb.dsa.strings;

public class FindCharInString {
	 public static void main(String[] args) {
		String str = "sachin";
		
		int idx = search(str, 'p');
		System.out.println(idx);
	}
	 
	 
	 public static int search(String str, char ch) {
		 
		 if(str.length() == 0) 
		 {
			 return -1;
		 }
		 
		 for(int idx = 0; idx < str.length()-1; idx++) {
			 if(str.charAt(idx) == ch) {
				 return idx;
			 }
		 }
		 return -1;
		 
	 }
}
