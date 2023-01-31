package com.mb.dsa.arrays;

public class MaxEleInArray {
	
	public static void main(String[] args) {
		int arr[] = {-110, -20, -445, -32, -123};
		int maxElement = findMaxElement(arr, arr.length);
		System.out.println("Max : " +  maxElement);
	}

	private static int findMaxElement(int[] arr, int length) {
		int maxElement = arr[0];
		for(int idx = 1; idx < length;idx++) {
			if(arr[idx] > maxElement) {
				maxElement = arr[idx];
			}
		}
		return maxElement;
	}

}
