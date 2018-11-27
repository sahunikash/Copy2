package com.StaticPractice;



public class Static10 
{
static int x=0;

static void test1()
{
	System.out.println("test1 :" +x);
	x=10;
}
static void test2()
{
	System.out.println("test2 :" + x);
	x=20;
}
public static void main(String[] args) 
{
	test1();
	System.out.println(x);
	test2();
	System.out.println(x);
}

}
