package com.cs.mathNalgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class MA_14_ArrayGCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];

			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}
			System.out.println(getArrayGCDC(arr));
		}
		sc.close();
	}

	private static int getArrayGCDC(int[] arr) {
		Arrays.sort(arr);
		
		if(arr.length == 1)
			return arr[0];

		int a = arr[0];
		int b = arr[1];

		int gcd = getGCD(a, b);
		
		for(int i = 2; i < arr.length; i++) {
			if(arr[i] % gcd != 0)
				return 1;
		}
		return gcd;
	}

	private static int getGCD(int a, int b) {
		int gcd = 1;
		
		for(int i = 2; i <= a; i++) {
			if(a%i==0 && b%i==0)
				gcd = i;
		}
		return gcd;
	}
}