package com.java.lab1;

import java.util.Scanner;

public class SumOfTheCubes {

	public static void main(String[] args) {
		 // input =32
		// output = 3^3^3 + 2^2^2
		 Scanner sc = new Scanner(System.in);
		 System.out.println(" Enter the input value : ");
		 int input = sc.nextInt();
		 int result = sumOfCubes(input);
		 System.out.println(" Result is : " +result);
	}
	  public static int  sumOfCubes( int n) {
		   int sum =0;
		 String input = String.valueOf(n);
		 for (  int i=0; i<input.length() ; i++)
		 {
			int digit = (int)input.toCharArray()[i];
			sum+= digit*digit*digit ;
		 }
		  return sum;
	  }
}
