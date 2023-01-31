package com.mb.dsa.algos;

public class CeillingOfNum {

	public static void main(String[] args) {
		/*
		 * arr => {2,3,5,9, 14, 16, 18} target = 9
		 * 
		 * ceilling of number can be defined as 
		 * the smallest element in array which is greater than or
		 *  equal to target
		 *  
		 *  ceilling(arr, target = 9) = 9
		 *  ceilling(arr, target = 15) = 16
		 *  ceilling(arr, target = 3) = 3
		 *  ceilling(arr, target = 4) = 5
		 *  
		 * 
		 * 
		 * 
		 * */
		int[] arr = {2,3,5,9, 14, 16, 18};
		
		int target = 15;
		
		int idx = ceilling(arr, target);
		System.out.println(idx);
	}

	public static int ceilling(int[] arr, int target) {
		
		if(target > arr[arr.length-1]) {
			return -1;
		}
		int start = 0;
		int end = arr.length-1;
		
		
		
		while(start <= end) {
			int mid = start + (end - start) /2;
			
			if(target > arr[mid]) {
				start = mid + 1;
			} else if(target < arr[mid]) {
				end = mid-1;
			}else {
				return mid;
			} 
			
			
		}
		
		return start;
	}
}
