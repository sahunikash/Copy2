package com.StaticPractice;

public class Static9 
{
static int x ;
static void m()
{
	System.out.println("m() :" + x);
	x =10;
	}
public static void main(String[] args) 
{
	System.out.println("main :" + x);
	x=20;
	m();
	System.out.println("main2 :" + x);
	
}
}
