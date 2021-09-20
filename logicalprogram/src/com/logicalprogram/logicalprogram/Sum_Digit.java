package com.logicalprogram.logicalprogram;

public class Sum_Digit {
	public static int digit(int num) {
		if(num==0) {
	return 0;
	
	}
		else {
			return num%10+digit(num/10);

			}
		}
		
		
	

	public static void main(String[] args) {
	int  num=12345;
	 System.out.println(digit(num));

	}

}
