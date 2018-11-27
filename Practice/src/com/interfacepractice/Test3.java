package com.interfacepractice;

interface a
{
	public void m();
	public void m1();
	}
abstract class b implements a
{ 
	public abstract void m();

	public void m1()
{ System.out.println("from m1");
	}
}
class c extends b
{
	
public  void m()
{
	
System.out.println("from m");}

}
public class Test3 
{
	public static void main(String[] args)
	{
	
		c C= new c();
		System.out.println(C);
		C.m();
		C.m1();
	}

}
