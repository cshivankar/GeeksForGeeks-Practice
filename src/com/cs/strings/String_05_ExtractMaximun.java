package com.cs.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_05_ExtractMaximun {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			String s = br.readLine();
			String regex = "\\d+";
			int max = -1;
			
			
			
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(s);
			
			while(m.find()) {
				int temp = Integer.parseInt(s.substring(m.start(), m.end()));
				if(temp > max)
					max = temp;
			}
			System.out.println(max);
		}
	}
			
//			char[] charArray = (br.readLine() + "a").toCharArray();
//			List<Integer> list = new ArrayList<>();
//			String n = "";
//			for(char c : charArray) {
//				
//				if(c >= 48 && c <= 57) {
//					n = n + c;
//				} else {
//					if(!"".equals(n)) {
//						list.add(Integer.parseInt(n));
//					}
//					n = "";
//				}
//			}
//			System.out.println(Collections.max(list));
			
		
}
