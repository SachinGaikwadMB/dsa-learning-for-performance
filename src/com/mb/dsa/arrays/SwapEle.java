package com.mb.dsa.arrays;

import java.util.Arrays;

public class SwapEle {

	public static void main(String[] args) {
		
		int[] arr = {1, 2,3, 4,5, 6,7};
		
		System.out.println(Arrays.toString(arr));
		swapElement(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void swapElement(int[] arr, int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	

}
