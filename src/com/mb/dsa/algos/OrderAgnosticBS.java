package com.mb.dsa.algos;

public class OrderAgnosticBS {
	
	public static void main(String[] args) {
		int[] arr = {90, 75, 18, 12, 6, 4,2,1};
		int target = 109;
		
		int idx = oderAgnosticBS(arr, target);
		System.out.println(idx);
		
	}

	public static int oderAgnosticBS(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		boolean isAsc = arr[start] < arr[end];
		
		while(start <= end) {
		
			int mid = start + (end -start)/2;
			
			if(target == arr[mid])
				return mid;
			
			if(isAsc) {
				
				if(target > arr[mid]) {
					start = mid+1;
				}else {
					end = mid -1;
				}
				
			}else {
				if(target < arr[mid]) {
					start = mid+1;
				}else {
					end = mid -1;
				}
			}
			
		}
		return -1;
		
	}
}
