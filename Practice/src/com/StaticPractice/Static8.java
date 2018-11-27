package com.StaticPractice;

public class Static8 
{
static int x =70;
{
	System.out.println("IIB :" +x);
	x=10;
	}
static
{
	System.out.println("SIB :"+x);
	x=20;
	}
public static void main(String[] args) 
{
	System.out.println("main " +x);
	//m();
	//Static8 s = new Static8();
	//s.m();
	System.out.println("main 2 :" + x);
}
}
