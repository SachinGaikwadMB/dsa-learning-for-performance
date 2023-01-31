package com.mb.dsa.arrays;

import java.util.Arrays;

public class ReversedArray {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		System.out.println("Original Arrays :  " + Arrays.toString(arr));
		reverseInRange(arr, 0,2);
		reverseInRange(arr, 3,5);
		
		System.out.println("Revered Arrays :  " + Arrays.toString(arr));

		
	}
	
	public static void reverseInRange(int[] arr, int start, int end) {
		while(start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}
	}
	
	public static void reseverOfArray(int[] arr) {
		int start = 0; 
		int end = arr.length-1;
		
		while(start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}
		
		
	}
	
	public static void swap(int[] arr, int idx, int jdx) {
		int temp = arr[idx];
		arr[idx] = arr[jdx];
		arr[jdx] = temp;
	}

}
