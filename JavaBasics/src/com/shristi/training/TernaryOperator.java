package com.shristi.training;

public class TernaryOperator {

	public static void main(String[] args) {

// condition ? execute if true : execute if false
		
		int num = 10;
		String res = num > 100 ? "Num is greater" : "Num is smaller";
		System.out.println(res);

		int val = num > 100 ? ++num : num--;
		System.out.println(val);

// find the greater of 3 numbers using ternary operator
		
		int a = 25, b = 40, c = 30;
		int greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println("Greatest number is: " + greatest);
	}
}