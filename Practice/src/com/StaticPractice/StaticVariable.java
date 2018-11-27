package com.StaticPractice;



public class StaticVariable 
{

	static int i =10;
	
	public static void main(String[] args) 
	{
		System.out.println(i);
		i =20;
		System.out.println(i);
	}
	public void  m1()
	{
		i=30;
		
		System.out.println(i);
	}
	

	public void m2()
	{
		int i =50;
		System.out.println(i);
		
	}
}
