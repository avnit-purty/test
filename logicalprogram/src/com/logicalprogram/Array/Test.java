package com.logicalprogram.Array;

public class Test {
	public static void main(String[] args) {
         Inter in=(a,b)->{
        	 return a+b;
         };
         System.out.println(in.add(20,20));
	}
}

interface Inter {
	public int add(int a, int b);
	// hello world
	// clone to world

}
