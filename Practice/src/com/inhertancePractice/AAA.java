package com.inhertancePractice;

class aaa4
{
	aaa4(int i)
	{
		System.out.println("from aaa()");
	}
	}
public class AAA extends aaa4
{
	AAA()
	{
		super(10);
		System.out.println("from AAA()");
	}
	public static void main(String[] args) 
	{
		aaa4 a3 = new AAA();
		//AAA A3 = new AAA();
		
	}

}
