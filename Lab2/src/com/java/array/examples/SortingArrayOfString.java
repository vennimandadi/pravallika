package com.java.array.examples;

public class SortingArrayOfString {

	public static void main(String[] args) {
		String[] str = { "one", "two", "three", "four", "five" };
		String[] result = sortStrings(str);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static String[] sortStrings(String[] input) {
		String[] temp = new String[input.length];

		int midNum = (input.length / 2)+1;
		for (int i = 0; i < input.length; i++) {
			if (i < midNum) {
				temp[i] = input[i].toUpperCase();
			} else {
				temp[i] = input[i].toLowerCase();
			}
		}
		return temp;
	}

}
