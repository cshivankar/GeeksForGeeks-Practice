package com.cs.mathNalgorithm;

import java.util.Scanner;

public class MA_04_BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			System.out.println(getDecimalFromBinary(sc.nextLong()));
		}
		sc.close();
	}

	private static int getDecimalFromBinary(long l) {
		String st = String.valueOf(l);
		
		//Better performance
		return Integer.parseInt(st, 2);

		//Without Direct Method
//		int i = 1;
//		int num = 0;
//		
//		while(l > 0) {
//			long j = l % 10;
//			num += j * i;
//			i *= 2;
//			l /= 10;
//		}
//		return num;
	}
}