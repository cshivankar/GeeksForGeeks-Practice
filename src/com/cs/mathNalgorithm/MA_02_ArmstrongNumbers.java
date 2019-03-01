package com.cs.mathNalgorithm;

import java.util.Scanner;

public class MA_02_ArmstrongNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			System.out.println(isArmstrngNumber(sc.nextInt()));
		}
		sc.close();
	}

	private static String isArmstrngNumber(int n) {
		int sum = 0;
		int temp = n;
		while(temp > 0) {
			int i = temp%10;
			temp = temp/10;
			sum += Math.pow(i, 3);
		}
		if(sum == n)
			return "True";
		else
			return "False";
	}
}