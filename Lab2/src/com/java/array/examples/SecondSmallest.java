package com.java.array.examples;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println(" enter input values : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Second Smallest Element is : " +sortStrings(arr));
	}
	
	public static int sortStrings(int[] input) {
		Arrays.sort(input);
		return input[1];
	}

}
