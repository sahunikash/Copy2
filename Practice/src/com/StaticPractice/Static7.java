package com.StaticPractice;

public class Static7 
{
static int i =19;
static void m()
{
	System.out.println("m()"+"->"+i);
	}
public static void main(String[] args) 
{
	System.out.println("main ->" + i);
	m();
	i=20;
	m();
}
}
