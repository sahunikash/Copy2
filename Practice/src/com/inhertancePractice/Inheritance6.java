package com.inhertancePractice;

class Inhe
{
	Inhe(int...k)
	{
		System.out.println("parents Constructor" );
	}
	}
class Ihe2 extends Inhe
{
	Ihe2(int i)
	{
		System.out.println("child construct");
	}
	
	}

public class Inheritance6 
{
	public static void main(String[] args) {
		
	
 //Inhe i = new Inhe(10);
// Ihe2 i2 = new Ihe2(10);
 Inhe i3 = new Ihe2(65);
	}
 
}
