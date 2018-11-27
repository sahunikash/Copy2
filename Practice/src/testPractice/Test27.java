package testPractice;

import java.util.Scanner;

public class Test27
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter String 1");
	String s = sc.nextLine();
	
	Scanner sc1 = new Scanner(System.in);
	
	System.out.println("enter string 2");
	String s1 = sc1.nextLine();
	
	if(s.equals(s1))
	{
		System.out.println("ur stirng is same");
	}
	else {
		System.out.println("ur string is not same");
	}
}
}
