package com.mb.dsa.arrays;

import java.util.Arrays;
public class SearchIn2DArray {
	
	public static void main(String[] args) {
		
		int[][] arr = {
				{1,2,3},
				{4,5},
				{6,7,8,9}
		};
		
		int[] ans = search(arr, 6);// 1,1
		System.out.println(Arrays.toString(ans));
		
	}
	
	public static int[] search(int[][] arr, int ele) {
		//Assume that array is not empty
		
		for(int rows = 0; rows < arr.length; rows++) {
			
			for(int cols = 0; cols < arr[rows].length; cols++) {
				if(arr[rows][cols] == ele) {
					return new int[] {rows, cols};
				}
			}
		}
		
		return new int[] {-1, -1};
	}
}
