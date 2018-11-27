package com.StaticPractice;

public class Static19 
{
static int i =test();
static int j =10;
static int test()
{
	return 30;
	}
public static void main(String[] args) 
{
	System.out.println(i);
	System.out.println(j);
	test();
	System.out.println(i);
}
}
