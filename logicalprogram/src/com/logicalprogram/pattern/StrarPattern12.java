package com.logicalprogram.pattern;

public class StrarPattern12 {
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
