package com.mb.dsa.arrays;

import java.util.SortedSet;
import java.util.TreeSet;

public class TwoArrayEqual {

	public static void main(String[] args) {
		
		long[] A = {1,2,5,4,0};
		long[] B = {2,4,5,0,1};
		System.out.println(check(A,B, 5));
	}
	
	 public static boolean check(long A[],long B[],int N)
	 {
		 SortedSet<Long> sset1  = new TreeSet<>();
		 SortedSet<Long> sset2  = new TreeSet<>();

		 for(int idx = 0; idx < N; idx++) {
			 sset1.add(A[idx]);
			 sset2.add(B[idx]); 
		 }
		 
		 return sset1.containsAll(sset2);
		 
		 
	 }
	       

}
