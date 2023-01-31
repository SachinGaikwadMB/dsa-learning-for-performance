package com.mb.dsa;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		
		long sum = sumOfDigit(num);
		System.out.println("sum : " + sum);
		
	}

	private static long sumOfDigit(long num) {
		long sum =  0;
		while(num != 0) {
			 long rem = num %10;
			 num = num/10;
			 sum = sum + rem;
			 
		}
		
		return sum;
	}

}
