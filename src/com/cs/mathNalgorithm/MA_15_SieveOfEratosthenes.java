package com.cs.mathNalgorithm;

import java.util.Scanner;

public class MA_15_SieveOfEratosthenes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			getPrimeNumberList(n);
		}
		sc.close();
	}

	private static void getPrimeNumberList(int n) {
		int[] a = new int[n+1];
		
		for(int i = 0; i < n+1; i++)
			a[i] = 1;
		
		for(int i = 2; i*i <= n+1; i++) {
			if(a[i]==1) {
				for(int j = i*i; j <=n; j=j+i) {
					a[j] = 0;
				}
			}
		}
		for(int i = 2; i <= n+1; i++) {
			if(a[i] == 1)
				System.out.print(i + " ");
		}		
		System.out.println();
	}
}