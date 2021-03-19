package com.java.lab1;

import java.util.Scanner;

public class TrafficLights {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Light color : \n");
		String userValue = sc.nextLine();
		if( userValue .equalsIgnoreCase("RED"))
			System.out.println(" Stop");
		else if( userValue .equalsIgnoreCase("Orange"))
			System.out.println(" Ready to Go");
		else if( userValue .equalsIgnoreCase("green"))
		   System.out.println(" Go");
		else 
			System.out.println(" ");
			
		}
	
		
	}
//eroj oka lab ipogodham antey ee tim  ayindi
// aa boxes cheyali mandatory 