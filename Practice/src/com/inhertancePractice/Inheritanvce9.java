package com.inhertancePractice;

class mm
{
	mm()
	{
	System.out.println("from mm-m2()-constructor-1");//5//3rd//4th
	}
	{
		System.out.println("from mm-m2{}-instance inlitial block");
	}
	static {
		System.out.println("from static mm-m2{}-static initial block ");
	}
	mm(int i)
	{
		this();
		System.out.println("from mm-m2(int i)- parameterize constructor/conctructor-2");//4//2nd//3rrd
	}
	
} 
class mmm extends mm
{
	mmm()
	{
		System.out.println("from mmm-m3()-constructor-1");
	}
	{
		System.out.println("from mmm-m3{}- instance inital block");
	}
	static {
		System.out.println("from static mmm-m3{}-static initial block");
	}
	
	mmm(int i)
	{
		super(i);
		System.out.println("from mmm-m3(int i)-parameterize constructor/constructor-2");//3//1st//2nd
	}
	
	}

class mmmm extends mmm
{
	mmmm()
	{
		this(90);
		System.out.println("from mmmm-m4()-constructor-1");//1st
		
	}
	mmmm(int i)
	{
		super(90);
		System.out.println("from mmmm-m4(int i)-parameterize constructor/construtor-2");//2nd//1st
	}
	{
		System.out.println("from mmmm-m4{}-instance initial block");
	}
	static {
		System.out.println("from Static mmmm-m4{}-Static initial block");
	}
	}
public class Inheritanvce9 
{

	public static void main(String[] args) 
	{
		/*mmmm m4 = new mmmm();
		System.out.println("========");
		mmm m3 = new mmm();
		System.out.println("========");
		mm m2 = new mm(10);
		System.out.println("========");*/
		
		
		mm m2 = new mm();
		System.out.println("===================");
		mmm m3 = new mmm(10);
		System.out.println("===================");
		mmmm m4 = new mmmm(20);
		
		
	}
	
	
	
}
