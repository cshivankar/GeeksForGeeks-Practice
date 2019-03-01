package com.cs.arrays;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Array_10_OperatingAnArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int x = sc.nextInt();
			int y = sc.nextInt();
			int yi = sc.nextInt();
			int z = sc.nextInt();
			
		}
		sc.close();
	}

	public boolean searchEle(int a[],int x)
    {
		int binarySearch = Arrays.binarySearch(a, x);
		return true;
	}
	public boolean insertEle(int a[],int y,int yi)
     {
           return true;
	}
	public boolean deleteEle(int a[],int z)
     {
		return true;
	}
}
