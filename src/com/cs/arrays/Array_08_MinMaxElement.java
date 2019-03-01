package com.cs.arrays;

import java.util.Scanner;

public class Array_08_MinMaxElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			findMinMax(arr);
		}
		sc.close();
	}

	private static void findMinMax(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		
		for(int i : arr) {
			if(i > max)
				max = i;
			if(i < min)
				min = i;
		}
		System.out.println(min + " " + max);
	}
}
