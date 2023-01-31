package com.mb.dsa;

public class HarshadNumber {

	/*
	 * 18 === sum of digits is 9 if 18 divided is completely divisible by 9 yes it
	 * is harshad number
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		boolean res = findHarshadNum(18);
		System.err.println(res);
	}

	private static boolean findHarshadNum(int num) {
		int sum = 0;
		int temp = num;

		while (num != 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;

		}

		if (temp % sum == 0)
			return true;

		return false;
	}
}
