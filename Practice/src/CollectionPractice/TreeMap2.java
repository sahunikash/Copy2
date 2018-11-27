package CollectionPractice;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap2 
{
	public static void main(String[] args) 
	{
		TreeMap m = new TreeMap(new TriT());
		m.put(4, "value");
		m.put(6, "value");
		m.put(9, 9);
		m.put(2, "valuess");
		m.put(1, 'v');
		//System.out.println(m.put(2, 199));
		System.out.println(m);
		
	}

}
class TriT implements Comparator

{
	public int compare(Object o1,Object o2)
	{
		
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		 return s2.compareTo(s1);
		
		
	}
	
	
	
	}
