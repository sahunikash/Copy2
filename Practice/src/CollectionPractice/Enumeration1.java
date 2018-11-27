package CollectionPractice;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration1 
{
public static void main(String[] args) 
{
	Vector v = new Vector();
	//v.add(1);
	//v.add(null);
	//v.add(2);
	//v.add(3);
	//v.add(4);
	//v.add(5);
	//v.add(6);
	//v.add(7);
	//v.add(8);
	//v.add(9);
	//v.add(10);
	System.out.println(v.size());
	System.out.println(v);
	for(int i =0;i<=10;i++)
	{
		v.addElement(i);
		System.out.println(v);
		System.out.println(i);
		
	}
	Enumeration e = v.elements();
	System.out.println(v.size());
	while(e.hasMoreElements())
	{
		Integer i = (Integer)e.nextElement();
		if(i%2==0)
		{
			//System.out.println(e);
			System.out.println(i);
		}
	}
	
	
}
}
