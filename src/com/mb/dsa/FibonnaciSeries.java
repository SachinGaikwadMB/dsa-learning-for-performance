package com.mb.dsa;

public class FibonnaciSeries {
	
	public static void main(String[] args) {
	 printFibonacci(10);
		
	}

	private static void printFibonacci(int n) {
		int a = 0;
		int b = 1;
		
		System.out.print(a + "\t" + b + "\t");
		//System.out.print(b);
		
		for(int i=3; i<n; i++){
			int c = a + b;
			System.out.print(c + "\t");
			a = b;
			b = c;
		}
		
		
	}
}
