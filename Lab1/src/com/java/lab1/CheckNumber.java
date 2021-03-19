package com.java.lab1;

import java.util.Scanner;

public class CheckNumber {
  
	public static void main(String[] args) {
		
			Scanner sc= new Scanner(System.in);
			
			System.out.println(" Enter input ");
			int input = sc.nextInt();
			
			boolean result = checkNumber(input); 
			System.out.println(" Result is " +result);
	}
	
	  static boolean checkNumber( int n) {
		  String input = String.valueOf(n);
		  boolean result = false;
		  for(int i=0; i<input.length()-1; i++)
		  {
			  
			  int first = input.charAt(i); 
			  int second = input.charAt(i+1);
			  
			  if(first <= second){ 
				  result = true;
			  }
			  else {
				  result = false; 
				break;  
			  }
				  
		  }
		  return result;
	  }
	
}
