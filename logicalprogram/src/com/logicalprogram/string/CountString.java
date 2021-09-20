package com.logicalprogram.string;

public class CountString {

	public static void main(String[] args) {
		String s = "abanti";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
