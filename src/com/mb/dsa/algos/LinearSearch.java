package com.mb.dsa.algos;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = { 10, 53, 2, 54, 35, 34 };
		
		int key = 35;

		boolean result = linearSearch(arr, key);
		System.out.println(result);

	}

	private static boolean linearSearch(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				return true;
		}
		System.err.println("Not found !");
		return false;
	}

}
