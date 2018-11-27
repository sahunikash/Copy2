package ExamQuestion;

import java.util.Scanner;

public class FindSumofAllNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sc1=sc.nextInt();
		int [] arr= new int[sc1];
		int sum=0 ;
		//int arr [] ={1,4,8,8,1,4,5,6,9};
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			//sum=sum+arr[i];
			
		}
		
		PrintArray(arr);
		
	}

	public static void PrintArray(int i[])
	{
		int arr1 = i.length;
		for(int i1=0;i1<arr1;i1++)
		{
			System.out.println(i[i1]);
			
		}
	}
}
