package com.java.lab1;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// power of 2
		// logic = 2^1 , 2^2
		// 8 = 2^3 so true      
		 Scanner sc = new  Scanner(System.in);
		 System.out.println(" Enter The input value :");
		 int input =  sc. nextInt();
		 boolean result = checkNumber( input);
		 System.out.println(" Result is : " +result);
	}
	 public static  boolean checkNumber( int n) {
		 if( n%2 == 0)		 
		 return true;
		 else return false;
	 }
}
