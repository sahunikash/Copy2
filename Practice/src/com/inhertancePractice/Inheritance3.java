package com.inhertancePractice;
class InheritanceE
{
	
	int i =12;
	static int j=1;
	void test1()
	{
		System.out.println("from test");
	}
	static void test2()
	{
		System.out.println("from test2");
	}
	}


class InheritanceF extends InheritanceE

{
	int m=10;
	static int n=20;
	void test3()
	{
		System.out.println("from test3");
	}
	static void test4()
	{
		System.out.println("test4");
	}
	}
public class Inheritance3 extends  InheritanceF
{
public static void main(String[] args) 
{
	InheritanceE.test2();
	test2();
	test4();
	InheritanceF.test2();
	InheritanceF.test4();
	j=99;
	n=198;
	Inheritance3 in  = new Inheritance3();
	in.test1();
	in.test3();
	InheritanceF inF = new InheritanceF();
	
	
}
}
