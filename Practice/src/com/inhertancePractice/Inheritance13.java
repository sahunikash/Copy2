package com.inhertancePractice;
class m1

{
	m1(int i)
	{
		System.out.println("m1(int)");
	}
	{
		System.out.println("m1-IIB");
	}
	m1(int i ,int j)
	{
		this(j);
		System.out.println("m1(int i,int j)");
	}
	}
class m2 extends m1
{
m2()
{
	super(10,20);
	}
{
	System.out.println("m2-IIB");
	}
m2(int i)
{
	this();
	System.out.println("m2(int i)");
	}
m2(double d)
{
	super(10);
	System.out.println("M2(double)");
	}

	}
public class Inheritance13 

{
	public static void main(String[] args) {
		
	
	//m1 m1 =  new m1(10);
	//m1 m2 = new m1(10,32);
	//m2 m3= new m2();
	//m2 m4 = new m2(10);
	//m2 m5 = new m2(10.4d);
	m1 m6 = new m2();
	}
	
	

}
