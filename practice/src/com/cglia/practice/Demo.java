package com.cglia.practice;

@FunctionalInterface
interface Vehicles {
	void horn();

	// After 5 years..
	static void speedMeter() {
		System.out.println("speedometer added.....");
	}

	default void setSpeedLimit() {
		System.out.println("my speed limit 60 kmph");
	}

}

class Bike implements Vehicles {

	@Override
	public void horn() {
		System.out.println("pip..pip....");

	}
}

class Truck implements Vehicles {

	@Override
	public void horn() {
		System.out.println("pop..pop....");
	}

	public void setSpeedLimit() {
		System.out.println("my speed limit is 50kmph");
	}

}

public class Demo {

	public static void main(String[] args) {
		Vehicles v1 = new Bike();
		v1.horn();              //pip..pip....
		v1.setSpeedLimit();		//my speed limit 60 kmph
		Vehicles v2 = new Truck();
		v2.horn();				//pop..pop....
		v2.setSpeedLimit();		//my speed limit 50 kmph

	}

}
