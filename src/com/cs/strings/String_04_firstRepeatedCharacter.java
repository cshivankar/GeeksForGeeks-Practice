package com.cs.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class String_04_firstRepeatedCharacter {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			String res = "-1";
			char[] arr = br.readLine().trim().toCharArray();
			Map<Character, Integer> map = new HashMap<>();
			
			for(char c : arr) {
				if(map.containsKey(c)) {
					res = ""+c;
					break;
				}
				else 
				    map.put(c, 0);
			}
			System.out.println(res);
		}
	}
}
