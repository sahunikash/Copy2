package com.inhertancePractice;

class In
{
	In()
	{
		System.out.println("In()");
	}
	static {
		System.out.println("SIB");
	}
	void test()
	{
		System.out.println("test");
	}
	In(int i)
	{
		System.out.println("Int()");
	}
	}
class In2 extends In
{
	In2()
	{
		super();
		System.out.println("In2()");
	}
 void In()
{
	 System.out.println("child");
	}
}
public class Inheritance5 
{
	public static void main(String[] args) 
	{
		In in = new In(10);
		//In in2 = new In2();
		In2 in3 = new In2();
		//in3.In();
		
	}

}
