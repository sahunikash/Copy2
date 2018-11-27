package com.inhertancePractice;

class In8 {
	In8() {
		System.out.println("In8()");
	}
	{
		System.out.println("IN8-IIB");
	}
	In8(int i,int j)
	{ 
		this();
		System.out.println("In8(int i, int j)");
		
	}
	In8(int i)
	{
		
		
		System.out.println("In8(int i)");
	}
}
public class Inheritance8 extends In8
{
	Inheritance8()
	{
		super();
		System.out.println("Inheritance8()");
	}
	Inheritance8(int i,int j)
	{
		super(12,43);
		System.out.println("Inheritance8(int i int j)");
	}
	{
		System.out.println("Inheritance8-IIB");
	}
	Inheritance8(int i)
	{
		this();
		System.out.println("int");
	}
	Inheritance8(double d)
	{
		super(10);
	 
		System.out.println("Inheritance8 (double d)");
	}
	
	
	public static void main(String[] args) 
	{
		In8 i = new In8();
		In8 i1 = new In8(10);
		In8 i2 = new In8(10,43);
		
		Inheritance8 I =  new Inheritance8();
        Inheritance8 I1 = new Inheritance8(10);
	    Inheritance8 I2 = new Inheritance8(10,90);
	    Inheritance8 I3 = new Inheritance8(10.8);
		
	}

}
