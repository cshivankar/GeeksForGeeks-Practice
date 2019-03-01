package com.cs.arrays;

import java.io.IOException;
import java.util.Scanner;

public class Array_09_MinDistanceBetweenElements {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			long[] arr = new long[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			long x = sc.nextLong();
			long y = sc.nextLong();
			
			
			System.out.println(findMinDistance(arr, n, x, y));
		}
		sc.close();
	}

	private static long findMinDistance(long[] arr, int n, long x, long y) {
		long distance = -1;
		long tempIndex1 = -1;
		long tempIndex2 = -1;
		for(int i = 0; i < n; i++) {
			if(arr[i] == x)
				tempIndex1 = i;
			if(arr[i] == y)
				tempIndex2 = i;
			System.out.println(tempIndex1 + "\t" + tempIndex2);
			if(tempIndex1 != -1 && tempIndex2 != -1) {
				long temp = Math.abs(tempIndex1 - tempIndex2);				
				if(distance == -1)
					distance = temp;
				else
					distance = Math.min(distance, temp);
			}
		}
		return distance;
	}
}
