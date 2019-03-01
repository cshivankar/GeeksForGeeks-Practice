package com.cs.mathNalgorithm;

import java.util.Scanner;

public class MA_01_SeriesAP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int[] num = new int[2];
			num[0] = sc.nextInt();
			num[1] = sc.nextInt();
			int n = sc.nextInt();
			
			System.out.println(findAP(num,n));
		}
		sc.close();
	}

	private static int findAP(int[] num, int n) {
//		Arrays.sort(num);
		//AP - a[n] = a[0] + (n-1)*d; 		d = a[1] - a[0]
		return num[0] + (n-1)*(num[1] - num[0]);
	}
}
