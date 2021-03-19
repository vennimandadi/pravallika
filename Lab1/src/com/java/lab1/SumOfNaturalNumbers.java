package com.java.lab1;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the input value : ");
		int input = sc.nextInt();
		int result = calculateSum(input);
		System.out.println(" Sum  = " + result);

	}

	public static int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;

			}
		}

		return sum;
	}
}