package com.java.lab1;

import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter input value : ");
		int input = sc.nextInt();
		System.out.println( " Diffrence = "+ calculateDifference( input));
	}

	public static int calculateDifference(int n) {
		int sum1 = 0, sum2 = 0;
		for (int i = 1; i <= n; i++) {
			sum1 += i*i;
			sum2 += i;
		}

		return sum1 - (sum2*sum2);

	}

}
