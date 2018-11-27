package com.inhertancePractice;
class m12
{
	m12()
	{
		System.out.println("m12()");
	}
	{
		System.out.println("m12-IIB");
	}
	}
class m123 extends m12
{
	m123(int i)
	{
		//super();
		System.out.println("m123(int )");
	}
	{
		
		System.out.println("m123-IIB");
	}
	}




public class Inheritance14 
{
	public static void main(String[] args) 
	{
		//m12 m12 = new m12();
		m123 m123 = new m123(10);
		
	}

}
