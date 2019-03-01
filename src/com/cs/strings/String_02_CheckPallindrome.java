package com.cs.strings;

import java.util.Arrays;
import java.util.Scanner;

public class String_02_CheckPallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			String flag = "No";
			int n = sc.nextInt();
			sc.nextLine();
			char[] a = sc.nextLine().trim().toCharArray();
			System.out.println(Arrays.toString(a));
			String s1 = "";
			String s2 = "";
			
			if(n==1)
				flag = "Yes";
			else if(n == 2 && a[0] == a[1])
				flag = "Yes";
			else {
				if(n%2 != 0) {
					for(int i = 0; i < n/2 + 1; i++ ) {
						s1 += a[i];
					}
					for(int i = n-1; i >= n/2; i--) {
						s2 += a[i];
					}
					System.out.println(s1 + "-" + s2);
					if(s1.equals(s2))
						flag = "Yes";
				} else {
					for(int i = 0; i < n/2; i++ ) {
						s1 += a[i];
					}
					for(int i = n-1; i >= n/2; i--) {
						s2 += a[i];
					}
					System.out.println(s1 + "-" + s2);
					if(s1.equals(s2))
						flag = "Yes";
				}
			}
			System.out.println(flag);
		}
		sc.close();
	}

}
