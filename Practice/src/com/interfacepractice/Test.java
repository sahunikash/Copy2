package com.interfacepractice;

interface shape
{
	void draw();
	}
class reactangle implements shape
{
	public void draw()
	{
		System.out.println("readctangle draw");
	}
	}
class circle implements shape
{
	public void draw()
	{
		System.out.println("circle draw");
	}
	}

public class Test 
{
public static void main(String[] args) 
{
	shape r = new reactangle();
	r.draw();
	shape r1 = new circle();
	r1.draw();
	
}
}
