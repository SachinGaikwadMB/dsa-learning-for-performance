package com.mb.dsa.recursion;

public class Fibonnacci {
	
	public static void main(String[] args)  {
		int ans = fibo(4);
		
		System.out.println(ans);
	}
	
	public static int fibo(int n) {
		
		if(n < 2) {
			return n;
		}
		
		return fibo(n-1) + fibo(n-2);
	}
}
