package com.logicalprogram.Array;

public class Example {
	int a=0;
	int b=0;
	

	public Example(int x, int y) {
		this.a = x;
		this.b = y;
	}


	@Override
	public String toString() {
		return "Example [a=" + a + ", b=" + b + "]";
	}


	public static void main(String[] args) {
           Example ex = new Example(10, 20);
           System.out.println(ex);
	}

}
