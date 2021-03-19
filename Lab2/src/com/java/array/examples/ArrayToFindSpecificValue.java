package com.java.array.examples;
import java.util.Scanner;

public class ArrayToFindSpecificValue {

	public static void main(String[] args) {
		int [] arr = new int[] {-1,10,23,5,8,6,-3,0};
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter value \n");
		 int userValue= sc.nextInt();
		 String temp = "";
		 for(int i=0; i<arr.length; i++) {
			 if(arr[i] == userValue ) {
				 temp = "Exist";
			 break;
			 }else
				 temp = "Not Exist";
		 }
		if(temp.equals("Exist" ))
		 System.out.println("Your Value " + userValue + " Founded");
		else
			System.out.println(" No value found");
			
	}

}
