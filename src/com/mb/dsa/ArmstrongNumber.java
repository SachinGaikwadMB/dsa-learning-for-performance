package com.mb.dsa;

public class ArmstrongNumber {

	public static void main(String[] args) {

		boolean res = findArmstrongNum(153);
		System.out.println(res);

	}

	private static boolean findArmstrongNum(int n) {
		int sum = 0;
		int temp = n;
		while (n != 0) {
			int rem = n % 10;
			sum = rem * rem * rem + sum;
			n = n / 10;
		}

		if (temp == sum)
			return true;

		return false;
	}

}
