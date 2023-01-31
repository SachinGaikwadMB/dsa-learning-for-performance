package com.mb.dsa.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {1,2 ,5, 4, 6, 7};
		
		System.out.println(Arrays.toString(arr));
		
		reverseArr(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void reverseArr(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}
	}
	
	public static void swap(int[] arr, int idx1, int idx2) 
	{
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
}
