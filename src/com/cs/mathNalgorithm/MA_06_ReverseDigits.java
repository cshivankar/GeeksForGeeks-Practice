package com.cs.mathNalgorithm;

import java.util.Scanner;

public class MA_06_ReverseDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			System.out.println(getReverseDigitNumber(sc.nextLong()));
		}
		sc.close();
	}

	private static long getReverseDigitNumber(long n) {
		long number = 0;
		long multiplier = 1;
		long temp = n;
		
		while(temp > 0) {
			multiplier *= 10;
			temp /= 10;
		}
		multiplier /= 10;
		while(n > 0 && multiplier > 0) {
			number += multiplier*(n%10);
			n /= 10;
			multiplier /= 10;
		}
		return number;
	}
}
