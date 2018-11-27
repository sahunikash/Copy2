package com.interfacepractice;

interface ns
{
	public void m1();
	
	}
interface n2 
{
	public void m1(int i);
}
 class cl implements ns,n2
 {
	 public void m1()
	 {
		 System.out.println("no args");
	 }
	 public void m1(int i)
	 {
		 int j = i;
		 System.out.println(j);
	 }
 }
  class cl1 extends cl
  {
	  
  }

public class Test7 
{
public static void main(String[] args) 
{
cl C = new cl();
C.m1();
C.m1(10);
}
}
