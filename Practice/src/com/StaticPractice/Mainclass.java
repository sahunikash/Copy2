package com.StaticPractice;

class StaticComponent
{
	static int variable;
	static {
		System.out.println("StaticComponent-SIB");
		variable=10;
	}
	public static void se1()
	{
		System.out.println(variable);
	}
	public static void sc()
	{
		System.out.println("");
		System.out.println(variable);
	}
	
}
public class Mainclass 
{
	
	static {
		System.out.println("Main-SIB");
	}
	public static void main(String[] args) 
	{
		StaticComponent.se1();
		StaticComponent.variable=30;
		StaticComponent.sc();
		
		
	}

}
