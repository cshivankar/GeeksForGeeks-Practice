package com.cs.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_06_UncommonCharacters {

	public static void main (String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
		    String s = br.readLine().trim();
		    br.readLine();
		    s = s.replaceAll(" ", "%20");
		    System.out.println(s);
		}
		br.close();
	}
}
