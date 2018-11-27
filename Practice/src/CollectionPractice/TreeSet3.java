package CollectionPractice;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet3 
{
	public static void main(String[] args) 
	{
		TreeSet t = new TreeSet(new MyComparator123());
		t.add("A");
		//t.add(new StringBuffer("Abc"));
		//t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("AA");
		t.add("A");
		System.out.println(t);
		
	}

}
class MyComparator123 implements Comparator
{
	
	
	public int compare(Object o,Object o1)
	{
		String s = (String)o;
		String s1 = (String)o1;
		
		int i = s.length();
		int i2 = s1.length();
		
		if(i<i2)
		{
			return -1;
		}
		else if(i>i2)
		{
			return +1;
		}
		else
		{
			
				return s.compareTo(s1);
	}
		}
	
	
	
	
	
	
	
	
	
	
	}