package com.StaticPractice;

public class Static25 
{
static int i =test();
static{
	
	System.out.println("from SIB");
	main(null);
	System.out.println("from SIB end");
}
static int test()
{
	System.out.println("from test");
	main(null);
	System.out.println("From test end");
	return 10;
	}
public static void main(String[] args) 
{
	System.out.println("from main");
	System.out.println(i);
	
}
static {
	System.out.println("from SIB2");
	
}
}
