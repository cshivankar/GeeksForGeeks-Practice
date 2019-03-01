package com.cs.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_06_RotateArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			String[] x = br.readLine().trim().split(" ");
			
			int n = Integer.parseInt(x[0]);
			int d = Integer.parseInt(x[1]);
			String line = br.readLine();
			String arr[] = line.trim().split("\\s+");
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < n; i++) {
				int a = d%n;
				sb.append(arr[a] + " ");
				d++;
			}
			System.out.println(sb);
		}
	}
}
