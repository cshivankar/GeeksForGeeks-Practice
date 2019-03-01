package com.cs.mathNalgorithm;

import java.util.Arrays;

public class MA_00_CountingSort {

	public static void main(String[] args) {
		int[] arr = {5,15,10,7,12,4,9,13,10};
		
		int min = arr[0];
		int max = arr[0];
		for(int i : arr) {
			if(i < min) {
				min = i;
			}
			if(i > max) {
				max = i;
			}
		}
		System.out.println(Arrays.toString(arr));
		arr = countingSort(arr, min, max);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] countingSort(int[] arr, int min, int max) {
		int[] output = new int[arr.length];
		int[] count = new int[max - min + 1];
		System.out.println(Arrays.toString(count) + "-"+min+"-"+max);
		for(int i : arr) {
			count[i - min]++;
		}
		System.out.println(Arrays.toString(count));
		count[0]--;
		System.out.println(Arrays.toString(count));
		for(int i = 1; i < count.length; i++) {
			count[i] += count[i-1];
		}
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.println(i);
			output[count[arr[i] - min]--] = arr[i];
			System.out.println(Arrays.toString(output));
		}
		return output;
	}
}