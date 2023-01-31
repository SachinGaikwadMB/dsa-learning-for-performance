package com.mb.dsa;

public class ApowerN {
	
	public static void main(String[] args) {
		int a = 3;
		int n = 3;
		
		// 2 x 2 x 2 = 8
		
		int p = 1;
		for(int i=1; i<=n; i++) {
			p = p * a;
			// 2 = 1 x 2
			// 4 = 2 x 2
			// 8  = 4 x 2			
			
		}
		System.out.println("A^N : " + p);
		
	}
}
