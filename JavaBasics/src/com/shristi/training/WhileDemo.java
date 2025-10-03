package com.shristi.training;

public class WhileDemo {

	public static void main(String[] args) {
		int x = 0;
// while loop - will not print if condition is not satisfied
		while (x < 10) {
			System.out.println(x);
			x++;
		}
		System.out.println();
// do-while loop - prints at least once even if condition is not satisfied
		do {
			System.out.println(x);
			x++;
		} while (x < 20);
	}
}