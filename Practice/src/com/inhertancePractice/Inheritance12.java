package com.inhertancePractice;
class testm 
{
	/*testm()
	{
		System.out.println("from testm");
	}*/
	testm(int i)
	{
		this();
		System.out.println("from testm(int i)");
	}
	testm()
	{
		
		System.out.println("from testm");
	}
	}
class testm2 extends testm
{
	
	 testm2()
	{
		super(10);
	}
	
	
testm2(int i)
{
	System.out.println("from testm2(int i)");
	}
testm2(double d)
{
	this(10);
	}
}
public class Inheritance12 
{
	public static void main(String[] args)
	{
		//testm m = new testm();
		//testm2 m2 = new testm2();
		//testm m25= new testm(19);
		testm2 m23 = new testm2(9.87d);
	}


}

