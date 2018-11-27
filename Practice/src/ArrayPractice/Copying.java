package ArrayPractice;

public class Copying 
{
public static void main(String[] args) 
{
	//int [] b = new int[5];
	int b [] ={2,4,65,87,9}; 
	System.out.println(b.length);
	int c [] = new int[b.length];
	for(int i =0;i<b.length;i++)
	{
		c[i]=b[i];
		System.out.println(b[i]);
		System.out.println(c[i]);
	}
	c[2]=10;
	System.out.println(b[2]);
	System.out.println(c[2]);
	b[2]=20;
	System.out.println(b[2]);
	System.out.println(c[2]);
	
	
	
	/*int a [] = {1,12,34,43,51};
	int b[] =a;
	
	for(int i =0;i<b.length;i++)
	{
		System.out.println(b[i]);
	}
	b[2] =10;
	System.out.println(a[2]);
	a[2]=60;
	System.out.println(b[2]);*/
	
	
	
	
}
}
