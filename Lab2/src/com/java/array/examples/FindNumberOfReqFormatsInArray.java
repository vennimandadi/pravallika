package com.java.array.examples;

import java.util.Scanner;

public class FindNumberOfReqFormatsInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		System.out.println("Enter 20 digits : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int oddNumbers = 0;
		int evenNumbers = 0;
		int positiveNumbers = 0;
		int negativeNumbers = 0;
		int zeros = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 == 0) {
				evenNumbers++;
			}
			if (arr[i]%3 == 0) {
				oddNumbers++;
			}
			if (arr[i] >= 0) {
				positiveNumbers++;
			}
			if (arr[i] < 0) {
				negativeNumbers++;
			}
			if (arr[i] == 0) {
				zeros++;
			}
		
		}
			
		
		System.out.println(" Odd Numbers : " + oddNumbers);
		System.out.println(" Even Numbers : " + evenNumbers);
		System.out.println(" Positive Numbers : " + positiveNumbers);
		System.out.println(" Negative Numbers : " + negativeNumbers);
		System.out.println(" zeros : " + zeros);
		
	}

}
