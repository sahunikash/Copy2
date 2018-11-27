package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Search2 
{
	public static void main(String[] args)
	{
		ArrayList ar = new ArrayList();
		for(int i =0;i<=19;i++)
		{
			ar.add(i);
		}
		ar.add(12);
		ar.add(877);
		ar.add(76);
		//System.out.println(ar);
		Collections.sort(ar);
		Collections.sort(ar, new ator());
		//System.out.println(ar);
		System.out.println(Collections.binarySearch(ar, 12, new ator()));
		System.out.println(Collections.binarySearch(ar, 18, new ator()));
		System.out.println(ar);
		}
	}
class ator implements Comparator 
{
	
 
	public int compare(Object o1,Object o2)
	{
		Integer i = (Integer)o1;
		Integer i1 = (Integer)o2;
		return i1.compareTo(i);
		
	}

}


