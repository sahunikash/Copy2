package com.inhertancePractice;

class m
{
	m()
	{
		System.out.println("from Inheritanc10 constructor");
	}
	static {
		System.out.println("from static 1");
	}

public void m ()
{
	System.out.println(10);
	}
}
public class Inheritanc10 extends m
{
	Inheritanc10()
	{
		System.out.println("from constructor m");
	}
	
	static {
		System.out.println("from static 2");
	}
	
	
	
	public static void main(String[] args) 
	{
		Inheritanc10 i = new Inheritanc10();
		//Inheritanc10 i2= new m();
		m m3 = new Inheritanc10();
		m3.m();
		m m1 = new m();
		
	}
	}
