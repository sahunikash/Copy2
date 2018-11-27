package ExamQuestion;

import java.util.Scanner;

public class EqualityOf2Arrays2 
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 1st Array");
	String a = sc.nextLine();
	System.out.println("enter 2nd Array");
	String b = sc.nextLine();
	 
	 char [] c =a.toCharArray();
	 char [] c1=b.toCharArray();
	 boolean B =true;
	 if(c.length==c1.length)
	 {
		for(int i =0;i<c.length;i++)
		{
			if(c[i]!=c1[i])
			{
				B=false;
			}
		}
	 }
	 else
	 {
	   B=false;	 
	 } 
	 if(B)
	 {
		 System.out.println("Given arrays are equality");
	 }
	 else{
		 System.out.println("given arrays are not equality ");
	 }
	 
}
	
}
