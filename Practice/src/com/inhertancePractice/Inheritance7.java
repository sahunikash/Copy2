package com.inhertancePractice;
class IN1
{
	IN1(int i)
	{
		System.out.println("IN()");
	}
	}
class INN2 extends IN1
{
	INN2(int i)
	{
		super(i);
		System.out.println("IN2()");
	}
	
	INN2()
	{
		super(10);
		System.out.println("IN2");
		
		
	}
	}
public class Inheritance7 
{
public static void main(String[] args)
{
	
	IN1 i = new IN1(10);
	INN2 i2 = new INN2(20);
	INN2 i3 = new INN2();
	IN1 i4 = new INN2();
}
}
