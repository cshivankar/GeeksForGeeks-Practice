package com.cs.mathNalgorithm;

import java.util.Scanner;

public class MA_11_ClosestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			System.out.println(getClosestNumber(sc.nextInt(), sc.nextInt()));
		}
		sc.close();
	}

	private static int getClosestNumber(int a, int b) {
		int n1 = 0;
		int n2 = 0;
		
		for(int i = a; i < 1000; i++) {
			if(i%b==0) {
				n1 = i;
				break;
			}
		}
		
		for(int i = a; i > -1000; i--) {
			if(i%b==0) {
				n2 = i;
				break;
			}
		}
		
		return (n1 - a) < (a - n2) ? n1 : n2;
	}
}
