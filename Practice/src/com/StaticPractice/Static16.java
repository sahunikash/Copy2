package com.StaticPractice;

public class Static16 
{
	static int i =10;
	static int j =test();
	static int test()
	{
		System.out.println("test :" +  i);
		
		return 20;
	}
public static void main(String[] args) 
{
	System.out.println(i);
System.out.println(j);}
}
