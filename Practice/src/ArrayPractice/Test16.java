package ArrayPractice;

import java.util.Scanner;

public class Test16 
 {
	
	 void min(int[] a){
	  int min = a[0];
	  for(int i=0; i< a.length; i++) {
	   if(min>a[i]) {
	    min = a[i];
	   }
	  }
	  System.out.print("Smallest = "+min);
	 }
	 public static void main(String[] a)
	 {
	  Scanner s=new Scanner(System.in);
	  System.out.print("Enter Array Size: ");
	  int n = s.nextInt();
	  int arr[] = new int[n];
	  System.out.print("Enter Elements: ");
	  for(int i=0;i < n; i++) {
	   arr[i] = s.nextInt();
	  }
	  Test16 t = new Test16();
	  t.min(arr);
	 }
	} 
