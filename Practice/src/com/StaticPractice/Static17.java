package com.StaticPractice;

public class Static17 
{
static int test()
{
	System.out.println("test :" +i);//test:120
	i=40;
	return i;
	}
static int i = test() + test1();//120
static int test1()
{
	System.out.println("test1 :" + i);
	i =80;
	return i;
	}
public static void main(String[] args) 
{
	test();
	test1();
	System.out.println("test1_test2 :"+i);
}
}
