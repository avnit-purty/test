package com.logicalprogram.logicalprogram;

public class Aramstrong {

	public static void main(String[] args) {
           int n=153;
          int sumofcube=0,temp,a;
          temp=n;
          while(n>0) {
        	  a= n%10;
        	  n=n/10;
        	  sumofcube=sumofcube+(a*a*a);
          }
          if(temp==sumofcube) {
        	  System.out.println("armstrong");
          }
	}

}
