package com.shristi.arrays;

public class OneDimArray {

	public static void main(String[] args) {
		int[] nums = new int[4];
		System.out.println(nums.length); // output:4
		// populate
		nums[0] = 90;
		nums[1] = 80;
		nums[2] = 40;
		nums[3] = 50;
//		nums[4]=60;   // ArrayIndexOutOfBoundsException

		System.out.println(nums[0]); // output:90

		System.out.println("Printing values");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]); // output:90,80,40,50
		}
		// find the sum
		System.out.println("Finding sum");
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			System.out.println(sum); // output:90,170,210,260
			// 0+90
			// 90+80 = 170
			// 170+40 =210
			// 210+50 =260
		}
		System.out.println("Sum " + sum); //output: sum 260

		sum = 0;
		// using for each
		System.out.println("printing sum"); //output: 260

		// print the square of each number val*val
		for (int val : nums)
//        	sum = sum+val;
			sum += val; 
		System.out.println(sum); // output:sum 260

		// create another array of names of size 3
		// iterate and print the names in upper case
		// do this in a separate file - StringArrDemo
	}

}
