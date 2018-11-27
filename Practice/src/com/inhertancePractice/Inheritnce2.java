package com.inhertancePractice;

class InterfaceA
{
	static int i =10;
	void test1()
	{
		System.out.println("from test");
	}
	}
public class Inheritnce2 extends InterfaceA
{
	int j =20;
	void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String[] args) {
		
	
	Inheritnce2 In = new Inheritnce2();
	In.test1();
	In.test2();
	System.out.println(i);
	System.out.println(In.j);
	
	
	}
	

}
