package com.StaticPractice;

public class Static23 
{
	static int i =20;
public static void main(String[] args)
{
	System.out.println(i);
	System.out.println("main");
}
static {
	i =10;
	System.out.println("from SIB");
}
}
