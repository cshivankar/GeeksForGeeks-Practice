package com.cs.mathNalgorithm;

import java.util.Scanner;

public class MA_10_LCM_HCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int max = Math.max(a, b);
			System.out.println(getLCM(a,b,max) +" "+ getHCF(a,b,max));
		}
		sc.close();
	}

	private static int getHCF(int a, int b, int max) {
		int hcf = 1;
		for(int i = 2; i < max; i++) {
			if(a%i==0 && b%i==0)
				hcf = i;
		}
		return hcf;
	}

	private static int getLCM(int a, int b, int max) {
		int lcm = 0;

		while (true) {
			if (max % b == 0 && max % a == 0) {
				lcm = max;
				break;
			}
			max++;
		}
		return lcm;
	}
}
