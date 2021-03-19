package com.java.array.examples;

public class ArrayToSortElements {

	public static void main(String[] args) {
		int [] arr = new int[] {0,7,9,-3,10,-7,6,8};
		int temp = 0;
		for(int i=0; i< arr.length;i++) {
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]>=arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
		}
	}

