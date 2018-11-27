package ArrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Mearge2Arrays
{
public static void main(String[] args) 
{
	int a [] ={10,54,4,43};
	int b [] ={7,5,6,8,9,9};

	int c[]=new int [a.length+b.length];
	//System.out.println(c.length);
	for(int i =0;i<a.length;i++)
	{
	c[i]=a[i];
	//System.out.println(c[i]);
	}
	for(int j=0;j<b.length;j++)
	   {
		System.out.println(c[j+a.length]);
		c[j+a.length]=b[j];
		//System.out.println(c[j+a.length]);
		//System.out.println(b[j]);
	    }
	//System.out.println(Arrays.toString(c));
	}
	
}

