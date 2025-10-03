package com.shristi.training;

public class ForDemo {

	public static void main(String[] args) {
		// print array elements
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		// print multiplication table of 5 till 20
		for (int i = 1; i <= 20; i++) {
			System.out.println("5 x " + i + " = " + (5 * i));
		}
	}
}
