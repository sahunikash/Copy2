package com.inhertancePractice;

class Inh
{
	
	void test1()
	{
		System.out.println("from test");
	}
	}

public class Inheritance4 extends Inh
{
	void test1()
	{
		System.out.println("from child test1");
		
	}
	void test2()
	{
		System.out.println("from test2");
	}
	
	
public static void main(String[] args) 
{
 Inheritance4 I  = new Inheritance4();
 I.test1();
 I.test2();
 Inh i2 = new Inheritance4();
 i2.test1();
// i2.test2();
}
}
