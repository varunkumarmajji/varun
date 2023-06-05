package com.cglia.practice;

interface Vehicle
{
	void horn();
}
interface Mobile
{
	void call();
}
class ImplementVehicle
{
	public static void impHorn()
	{
		System.out.println("horn implementation...");
	}
}
class ImplementMobile
{
	public void impCall()
	{
		System.out.println("call implementation...");
	}
}
public class MethodReferenced {

	public static void main(String[] args) {
		Vehicle veh=ImplementVehicle::impHorn;
		veh.horn();
		ImplementMobile mob=new ImplementMobile();
		Mobile m=mob::impCall;
		m.call();
		

	}

}
