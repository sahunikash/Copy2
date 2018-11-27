package ArrayPractice;

import java.util.Scanner;

public class Test5 
{
	void min(int[] k)
	{
	int min = k[0];
	for(int h=0;h<k.length;h++)
	{
	if(min>k[h])
	{
		min=k[h];
	}
	}
	}
	
public static void main(String[] args) 
{
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the array size");
	int i = sc.nextInt();
	System.out.println("u have enter array size is =" + i);
	int arr [] = new int[i];
	System.out.println("enter elements");
	for(int a=0;a<i;i++)
	{
	arr[i] =sc.nextInt();	
	}
	Test5 t = new Test5();
	t.min(arr);
	
}
}
