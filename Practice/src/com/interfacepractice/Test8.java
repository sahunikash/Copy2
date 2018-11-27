package com.interfacepractice;
interface al 
{
	public void m1();
	}
interface al1
{
	public void m2();
	
	}
class al2 implements al
{
	public void m1()
	{ int i =0;
		System.out.println(i);
		
	}}
class al3 implements al1
{
	
public void m2()
{
	int j =20;
	System.out.println(j);
	}
}

public class Test8 
{
public static void main(String[] args) 
{
	al2 al = new al2();
	al1 all = new al3();
	al.m1();
	all.m2();
	
}
}
