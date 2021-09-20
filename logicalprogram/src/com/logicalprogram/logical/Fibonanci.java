package com.logicalprogram.logical;

public class Fibonanci {

	public static void main(String[] args) {
		int i = 0, n1 = 0, n2 = 1, sum, num = 10;
		while (num > i) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			i++;
			// System.out.print(n1+"+");
			System.out.print(sum + "+");
		}

	}
}
