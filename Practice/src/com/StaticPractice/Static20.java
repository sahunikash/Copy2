package com.StaticPractice;

public class Static20 
{
static int i =test();
static int test()
{
	System.out.println(" from test");//1
	return 10;
	
}
public static void main(String[] args) 
{
	System.out.println("from main1");//2
	System.out.println(i);//10
	System.out.println("from main2");//3
}
}
