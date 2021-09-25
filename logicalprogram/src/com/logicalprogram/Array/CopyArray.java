package com.logicalprogram.Array;

public class CopyArray {
	

	public static void main(String[] args) {
		
           int []arr=new int[] {1,2,3,4,5,6};
           int[]ar= new int[arr.length];
           for(int i=0;i<arr.length;i++) {
        	   ar[i]=arr[i];
           }
           for(int i=0;i<ar.length;i++) {
        	   System.out.print(ar[i]);
           }
	}

}
