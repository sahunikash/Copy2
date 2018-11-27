package com.StaticPractice;



public class Base 
{
	static int x =110;

	static {
		 m1();
		
		System.out.println("1st static block");	
		
	}
	
	
public static void main(String[] args) 
{
	m1();
	System.out.println("main-method");
	
}
public static void m1()
{
	System.out.println(y);
	}
static int y =10;

}
class Derived extends Base
{
	static int x =1000;
	static {
		m2();
	System.out.println("2nd static block");	
	}
	
	public static void main(String[] args) 
	{
		m2();
		System.out.println("Derived -main");
		System.out.println(x);
	}
	public static void m2()
	{
		System.out.println(y);
	}
	static {
		System.out.println("last-static block");
		
	}
	static int y =10098;
	
	
	}
