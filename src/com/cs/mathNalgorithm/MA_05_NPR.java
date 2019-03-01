package com.cs.mathNalgorithm;

import java.util.Scanner;

public class MA_05_NPR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(getNPRValue(n,r));
		}
		sc.close();
	}

	private static long getNPRValue(int n, int r) {
		return getFactorialValue(n)/getFactorialValue(n - r);
	}

	private static long getFactorialValue(int n) {
		long i = 1;
		while(n > 0) {
			i *= n--;
		}
		System.out.println(i);
		return i;
	}
}
