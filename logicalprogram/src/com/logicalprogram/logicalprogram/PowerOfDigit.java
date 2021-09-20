package com.logicalprogram.logicalprogram;

public class PowerOfDigit {
	public  static int power(int base,int exp) {
		if(exp==0||exp==1) {
			return base;
		}
		return base*power(base, exp-1);
		
	}

	public static void main(String[] args) {
		
int base=2;int exp=3;
System.out.println(power(base, exp));
	}

}
