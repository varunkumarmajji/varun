package com.cglia.practice;

public class Main {
	public static void main(String[] args) {

		// initialize the class with Integer data
		DemoClass demo = new DemoClass();
		demo.genericsMethod("String");
	}
}

class DemoClass {
	public <T> void genericsMethod(T data) {
		System.out.println("Generics Method:");
		System.out.println("Data Passed: " + data);
	}
}

