package com.cs.mathNalgorithm;

import java.util.Scanner;

public class MA_12_Kth_Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			System.out.println(getGP(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		sc.close();
	}
	
	private static int getGP(double a, double b, int n) {
		double ratio = b/a;
		
		//an = a * pow(r,n-1)
		
		return (int) Math.floor(a*Math.pow(ratio, (n-1)));
	}
}