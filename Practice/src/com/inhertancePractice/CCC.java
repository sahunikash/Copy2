package com.inhertancePractice;
class DDD 
{
	DDD(int i)
	{
		System.out.println("DDD(int i)");
	}
	}


public class CCC extends DDD
{
	CCC(int i)
	{
		super (i);
		System.out.println("CCC(int i)");
		
	}
	CCC()
	{
		super(10);
		System.out.println("CCC()");
		
	}
	
public static void main(String[] args) 
{
	DDD d3 = new DDD(10);
	CCC c3 = new CCC();
	CCC c3a= new CCC(10);
}
}
