package com.interfacepractice;
 interface ne1{
	 
	 int i = 10;
 }
 interface ne2
 {
	 String s = "nana";
	 
 }
 interface ne3 {
	 char c ='h';
 }


public class Test6 implements ne1,ne2,ne3
{
	public static void main(String[] args) 
	{
	System.out.println(i);
	System.out.println(s);
	System.out.println(c);
	}
	}