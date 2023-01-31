package com.mb.dsa;

import java.util.Scanner;

public class PatternEx1 {

	public static void main(String[] args) {
		
		/*
		 * ####
		 * ####
		 * ####
		 * ####
		 * */
		
		int n =  new Scanner(System.in).nextInt();
		for(int r = 1; r <= n; r++) {
			for(int c = 1; c <= n; c++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
