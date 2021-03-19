package com.java.array.examples;

import java.util.Arrays;

public class LengthOfConsecutive {

	public static void main(String[] args) {
		int arr[] = { 49, 1, 3, 200, 2, 4, 70 };
		//12345
		Arrays.sort(arr);
		
		int lengthofCons = 0;
		
		for(int i=0; i<arr.length;i++) {
			
			lengthofCons++;
			
			if((arr[i]+1) != arr[i+1]) { 
				break;
			}
			
		}
		System.out.println( " length = " +lengthofCons);
	}

}
