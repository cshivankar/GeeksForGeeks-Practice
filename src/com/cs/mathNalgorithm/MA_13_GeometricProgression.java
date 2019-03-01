package com.cs.mathNalgorithm;

import java.util.Scanner;

public class MA_13_GeometricProgression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			System.out.println(getKthDigit(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		sc.close();
	}
	
	private static int getKthDigit(int a, int b, int n) {
		long num = (long) Math.pow(a, b);
		int digit = 0;
		
		while(n-- > 0) {
			digit = (int) (num % 10);
			num /= 10;
		}
		return digit;
	}
}