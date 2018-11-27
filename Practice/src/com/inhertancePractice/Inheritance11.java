package com.inhertancePractice;
class Se
{
	Se(int i)
	{
		System.out.println("from-Se(int)");
	}
	class Tes extends Se
	{
		Tes()
		{
			super(10);
			System.out.println("from-Te()");
		}
		/*Te(int i)
		{
			super(i);
			System.out.println();
		}*/
	}
	}

public class Inheritance11
{
public static void main(String[] args)
{
	Se s = new Se(10);
	//Tes t =new Tes();
	
}
}
