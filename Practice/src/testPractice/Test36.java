package testPractice;

import java.util.Scanner;

public class Test36 
{
	static boolean flag = true;
	static int B;
	static int H;
	static
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter int");
	    B = sc.nextInt();
	    H = sc.nextInt();
	    
	    
	    if((B<=0 && H<=0)||(B>=0 && H>=0)){
	        //flag = true;
	        System.out.println(flag);

	    }else if((B<=0 && H>=0)||(B>=0 && H<=0)){
	       
	    //flag=false;
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	    }
	}
	public static void main(String[] args) {
		
	}
}
