package com.mb.dsa.arrays;

public class MaxEleIn2DArray {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,4},
				{5,6,98,7}, 
				{82, 34}
		};
		
		
		int maxVal = maximum(arr);
		System.out.println(maxVal);
		
		int minVal = minimum(arr);
		System.out.println(minVal);
	}
	
	public static int maximum(int[][] arr) {
		int max = Integer.MIN_VALUE;
		
		for(int[] innArr : arr) {
			for(int ele : innArr) {
				if(ele > max) 
					max  = ele;
			}
		}
		
		return max;	
	}
	
	public static int minimum(int[][] arr) {
		
		int min = Integer.MAX_VALUE;
		
		for(int[] innArr : arr) {
			for(int ele : innArr) {
				if(ele < min) 
					min  = ele;
			}
		}
		return min;	
	}
}
