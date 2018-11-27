package ArrayPractice;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class EqualityOfTwoArray 
{
public static void main(String[] args) 
{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("num of element for 1st array is");
	int  a = sc.nextInt();
	System.out.println("num of elements for second array is");
	int  b = sc.nextInt();

	int A [] = new int[a];
	int B [] = new int [b];
	
	for(int i=0;i<a;i++)
	{
		A[i]=sc.nextInt();
		
	}
	System.out.println("-----------");
	for(int i =0;i<b;i++)
	{
		B[i]=sc.nextInt();
	}
	
	System.out.println(Arrays.toString(A));
	System.out.println(Arrays.toString(B));
	
	Arrays.sort(A);
	Arrays.sort(B);
	System.out.println(Arrays.toString(A));
	System.out.println(Arrays.toString(B));
	System.out.println(Arrays.equals(A, B));
	
	
	
	
	//boolean trueOrNot = true;
	//if(A==B)
	//{
//		for(int i =0;i<A.length;i++)
//		{
//			if(A[i]!=B[i])
//			{
//				trueOrNot =false;
//			}
//			
//		}
//	}else
//	{
//		trueOrNot =false;
//	}
//	if(trueOrNot)
//	{
//		System.out.println("2 arays are equal");
//	}
//	else {
//		System.out.println("2 arrays are not equal");
//	}
//	

	
}
}

