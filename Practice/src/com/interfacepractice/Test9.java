package com.interfacepractice;
interface in 
{
	public int m1();
	}
interface inn {
	public String m2();
}
class x implements in,inn
{
	public int m1()
	{
		System.out.println(10);
		return 10;
	}
	public String m2()
	{
		System.out.println("lksjd");
		return "";
	}
	}


public class Test9 
{
 public static void main(String[] args) 
 { x m = new x();
 m.m1();
 m.m2();
 
 
	
}
}
