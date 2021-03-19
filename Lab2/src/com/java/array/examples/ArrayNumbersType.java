package com.java.array.examples;

import java.util.Scanner;

public class ArrayNumbersType {

	public static void main(String[] args) {
		int n;
		int [] arr = new int[20];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0; i<arr.length; i++)
    	{
			System.out.println(arr[i]=sc.nextInt() );
		}
		for(int i=0 ;i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
