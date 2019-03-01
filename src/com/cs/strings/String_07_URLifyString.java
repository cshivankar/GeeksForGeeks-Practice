package com.cs.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_07_URLifyString {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			String s1 = br.readLine();
			String s2 = br.readLine();
			
			for(char c = 'a'; c <= 'z'; c++) {
				if(s1.indexOf(c) >= 0 && s2.indexOf(c) < 0 || s1.indexOf(c) < 0 && s2.indexOf(c) >= 0)
					System.out.print(c);
			}
			System.out.println();
		}
	}
}
