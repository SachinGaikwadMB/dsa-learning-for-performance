package com.mb.dsa.algos;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		test();
		
//		int[] nums = {0,1,2,3,4};
//		int[] index = {0,1,2,2,1};
//		
//		int[] target = new int[nums.length];
//		
//		for(int ndx=0, idx=0, tdx=0; ndx<nums.length && idx<index.length && tdx < target.length;ndx++, idx++, tdx++) {
//			
//			if(index[idx] == tdx) {
//				target[tdx] = nums[ndx];
//			}else {
//				target[tdx] = nums[ndx];
//				swap(target,index[idx], tdx);
//			}
//		}
//		
//		System.out.println(Arrays.toString(target));
		
	}
	
	public static void swap(int[] nums, int idx1, int idx2)
	{ 	
		int temp = nums[idx1];
		nums[idx1] = nums[idx2];
		nums[idx2] = temp;
		
	}
	
  public static void test() {
	  ArrayList<Integer> ls = new ArrayList<>();
	  
	  for(int idx =0; idx < 6; idx++) 
		  ls.add(idx+1);
	  
	  for(int idx =0; idx < 6; idx++) 
		  
	  
	  System.out.println(ls.get(idx));
  }
	
	
}
