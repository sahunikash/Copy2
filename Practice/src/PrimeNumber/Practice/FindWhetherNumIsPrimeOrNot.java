package PrimeNumber.Practice;

import java.util.Scanner;

public class FindWhetherNumIsPrimeOrNot 
{
public static void main(String[] args) 
{
	FindWhetherNumIsPrimeOrNot f= new FindWhetherNumIsPrimeOrNot();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter num");
	int inputNum=sc.nextInt();
	
	boolean itsPrime = f.primeTest(inputNum);
	if(itsPrime)
	{
		System.out.println("its a prime num");
	}
	else
	{
		System.out.println("its not a prime num");
	}
}
public boolean primeTest(int inputNum)
{
	boolean itsPrime = true;
	if(inputNum<=1)
	{
		itsPrime = false;
		return itsPrime;
	}
	else{
		for(int i=2;i<inputNum/2;i++)
		{
			if((inputNum%i)==0){
			itsPrime =false;
			//break;
			}
			
		}
	}
	return itsPrime;
	
	}
}
