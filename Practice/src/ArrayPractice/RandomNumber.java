package ArrayPractice;

import java.util.Random;

public class RandomNumber 
{
public static void main(String[] args) 
{
Random rm = new Random();
for(int i =0;i<=10;i++)
{
	System.out.println(rm.nextInt(100));
	}
	
}
}
