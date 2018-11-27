package com.inhertancePractice;



class Abc
{
	int i=10;
	
public void test()
{
	System.out.println("Abc=test");
	}
}
class Bcd extends Abc
{
	int i =20;
	public void test()
	{
		System.out.println("Bcd-test");
	}
	
	}
public class Main1 
{
	public static void main(String[] args) 
	{
		Abc a = new Bcd();
		a.test();
		System.out.println(a.i);
		Bcd b = new Bcd();
		b.test();
		System.out.println(b.i);
		Abc a1 = new Abc();
		a1.test();
	
		
	}
}
