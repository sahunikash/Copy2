package ArrayPractice;

import java.util.Scanner;

public class Test7
{
	 
		 void min() {
		  Scanner s=new Scanner(System.in);
		  System.out.print("Enter Size: ");
		  int n = s.nextInt();
		  int a[]=new int[n];
		  System.out.print("Enter Element: ");
		  for(int i=0; i< n; i++){
		   a[i]= s.nextInt();
		  }
		  int min = a[0], m = 0;
		  for(int i =1; i< n; i++) {
		   if(a[i] < min) {
		    min = a[i];
		    m = i;
		   }
		  }
		  int smin = a[n-m-1];
		  for(int i =0 ; i< n; i++) {
		   if(smin> a[i] && m!= i) {
		    smin = a[i];
		   }
		  }
		  System.out.print("2nd Min = "+smin);
		 }
		 public static void main(String[] a)
		 {
		  Test7 t = new Test7();
		  t.min();
		 }
		}  

