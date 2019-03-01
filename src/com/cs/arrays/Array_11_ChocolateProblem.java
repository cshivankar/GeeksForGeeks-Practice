package com.cs.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_11_ChocolateProblem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String[] strArr = br.readLine().trim().split(" ");
			int m = Integer.parseInt(br.readLine());

			long[] arr = new long[n];
			for(int i = 0; i < n; i++) {
				arr[i] = Long.parseLong(strArr[i]);
			}
			System.out.println(getMinDiff(arr, n, m));
		}
		br.close();
	}

	private static long getMinDiff(long[] arr, int n, int m) {
		
		return 0;
	}

}
