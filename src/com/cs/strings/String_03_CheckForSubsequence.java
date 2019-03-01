package com.cs.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_03_CheckForSubsequence {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			int flag = 0;
			String[] s = br.readLine().trim().split(" ");
			String s1 = s[0];
			String s2 = s[1];
			
			int n1 = s1.length();
			int n2 = s2.length();
			
			System.out.println(n1 + "-" + n2);
			
			if(n1 == n2 && s1.equals(s2))
				flag = 1;
			else if(n2 > n1) {
				int k = 0;
				for(int i = 0; i < n2; i++) {
					if(s1.charAt(k) == s2.charAt(i)) {
						k++;
						if(k == n1) {
							flag = 1;
							break;
						}
					}
				}
			}
			System.out.println(flag);
		}
	}
}
