package com.cglia.practice;

/**
 * this class to represent pass by reference example
 * 
 * @author varun.majji
 *
 */

public class PassByRefernce {
	/**
	 * this is the main method
	 * 
	 * @param args to be called by jvm
	 */

	public static void main(String[] args) {

		PassByRefernce pv = new PassByRefernce();
		int[] number = { 10, 20, 30, 40, 50 };
		System.out.println("Before call-by-value: " + number[0]);

		pv.call(number);
		System.out.println("After call-by-value: " + number[0]);

	}

	/**
	 * this method to modify the passed array
	 * 
	 * @param num
	 */

	void call(int[] num) {
		System.out.println("before modification of value " + num[0]);
		// this local variable a is subject to change in its value
		num[0] = 555;
		System.out.println("after modification of value " + num[0]);
	}

}
