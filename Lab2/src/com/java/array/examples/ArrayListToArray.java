package com.java.array.examples;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Element1");
		list.add("Element2");
		list.add("Element3");
		list.add("Element4");
		String [] elementArray = new String[list.size()];
		
		for (int i =0; i<list.size(); i++) {
			elementArray[i] = list.get(i);
		}
		System.out.println("Elements in List : "+list);
		System.out.println("Elements in Array");
		
		for (int i =0; i<elementArray.length; i++) {
			System.out.println(elementArray[i]);
		}
		
		
		
	}

}
