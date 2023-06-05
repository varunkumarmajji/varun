package com.cglia.practice;

interface Bill
{
	int getRate();
}
class DomesticPlan implements Bill
{
    int rate;
	@Override
	public int getRate() {
		return rate=3;
		
	}
	
}
class CommercialPlan implements Bill
{
	int rate;
	@Override
	public int getRate() {
		return rate=7;
		
	}
	
}
class GetPlanFactory
{
	Bill getPlan(String type)
	{
		if("dom".equals(type))
		{
			return new DomesticPlan();
		}
		else if("com".equals(type))
		{
			return new CommercialPlan();
		}
		return null;
	}
}


public class Facade {

	public static void main(String[] args) {
		GetPlanFactory gp=new GetPlanFactory();
		Bill b=gp.getPlan("dom");
		if(b==null)
		{
			System.out.println("provide correct info");
		}
		else {
			int rate = b.getRate();
			System.out.println(rate);
		}
			

	}

}
