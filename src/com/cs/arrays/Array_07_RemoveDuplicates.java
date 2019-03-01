package com.cs.arrays;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_07_RemoveDuplicates {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				if (!list.contains(arr[i])) {
					list.add(arr[i]);
				}
			}
			StringBuilder sb = new StringBuilder();
			for (int s : list)
				sb.append(s + " ");
			System.out.println(sb);

		}
		sc.close();
	}
}
