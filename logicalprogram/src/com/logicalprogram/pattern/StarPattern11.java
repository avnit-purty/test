package com.logicalprogram.pattern;

public class StarPattern11 {

	public static void main(String[] args) {
  int n=5;
  for(int i=0;i<n;i++) {
	  for(int j=0;j<=i;j++) {
		  System.out.print("3");
	  }
	  for(int k=0;k<n;k++) {
		  System.out.print("*");
	  }
	  System.out.println();
  }
	}

}
