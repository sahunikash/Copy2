package calculator;

import java.util.Scanner;



public class calculator1 
{
	public static void main(String[] args) {
		
	
Scanner sc = new Scanner(System.in);
double fnum,snum,total;
System.out.println("enter fnum");
fnum=sc.nextDouble();
System.out.println("enter snum");
snum=sc.nextDouble();
total=fnum+snum;
System.out.println("total" +"="+total);
	}
}
