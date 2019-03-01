package com.cs.mathNalgorithm;

import java.util.Scanner;

public class MA_07_GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			System.out.println(getGCDNumber(sc.nextInt(), sc.nextInt()));
		}
		sc.close();
	}

	private static int getGCDNumber(int a, int b) {
		int gcd = 1;
		
		for(int i = 2; i <= a; i++) {
			if(a%i==0 && b%i==0) {
				gcd = i;
			}
		}
		return gcd;
	}
}
