package com.mb.dsa.arrays;

public class MinElementInArray {
	
	public static void main(String[] args) {
		int[] arr = {19, 34, 12, 53, 1,2, 3, 4, 21};
		int minEle = minElement(arr);
		System.out.println(minEle);
		
		
	}
	
	public static int minElement(int[] arr) {
		
		//Edge cases for minimum element.
		 int min = arr[0];
		
		if(arr.length == 0) 
			return -1;
		
		for(int idx = 1; idx < arr.length-1; idx++) {
			if(arr[idx] < min) {
				min = arr[idx];
			}
		}
		
		return min;
		
	}
}
