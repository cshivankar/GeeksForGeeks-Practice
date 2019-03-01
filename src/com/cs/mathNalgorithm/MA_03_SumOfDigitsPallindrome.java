package com.cs.mathNalgorithm;

import java.util.Scanner;

public class MA_03_SumOfDigitsPallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			System.out.println(isSumOfDigitPallindrome(sc.nextInt()));
		}
		sc.close();
	}

	private static String isSumOfDigitPallindrome(int n) {
		int sum = 0;
		while(n > 0) {
			sum += n%10;
			n /= 10;
		}
		String s1 = String.valueOf(sum);
		String s2 = new StringBuilder(s1).reverse().toString();
		
		if(s1.equals(s2)) {
			return "YES";
		} else {
			return "NO";
		}
	}
}
