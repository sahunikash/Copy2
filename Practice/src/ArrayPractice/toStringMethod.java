package ArrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class toStringMethod 
{
public static void main(String[] args) 
{
	int i[] = {10,20,30,03,03};
	
	Arrays.sort(i);
	Arrays.fill(i, 1090);;
	System.out.println(Arrays.toString(i));
	System.out.println(Arrays.binarySearch(i, 20));
	
	String s = "hellos";
	
	char [] c = s.toCharArray();
	for(int h=c.length-1;h>0;h--)
	{
		System.out.print(c[h]);
	}
	
	int i1 = 10;
	Integer I = new Integer(i1); 
	
	
	int i2 =10;
	Integer I2 = i2;
	
	Integer i3 =new Integer(10);
	int i4 = i3.intValue();
	
	Integer II = new Integer(10);
	int ii = II;
}
}
