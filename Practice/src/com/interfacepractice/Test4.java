package com.interfacepractice;

interface aA1
{
	
	int i =10;
	}
 class bB implements aA1
 {
	 void m1(){
	System.out.println(i);
	 }
 }

public class Test4 
{
public static void main(String[] args) 
{
	bB b =new bB();
	b.m1();
}

}
