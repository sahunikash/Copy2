package com.StaticPractice;

public class Static13 
{
static int x = 0;
static void  test1()
{
	System.out.println("test1 :" + x);
	x=1;
	}
static void test()
{
	
	System.out.println("test2 :" +x);
	x=2;
	}
public static void main(String[] args) 
{
	test1();
	System.out.println("main1 :" + x);
	test();
	System.out.println("main2 :" + x);
	
}
}
