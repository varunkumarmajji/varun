package com.cglia.practice;

interface Calculator {
	int add(int num1, int num2);
}

public class LambdaExample {
	public static void main(String[] args) {
		// Conventional way to provide implementation
		Calculator cal = new Calculator() {
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		int result = cal.add(10, 20);
		System.out.println(result);

		// using lambda
		Calculator calLambda = (num1, num2) -> num1 + num2;
		int result1 = calLambda.add(30, 20);
		System.out.println(result1);

	}
}
