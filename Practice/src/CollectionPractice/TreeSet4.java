package CollectionPractice;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet4 
{
	public static void main(String[] args) {
		
	
	TreeSet t = new TreeSet(new MyComparator_());
	t.add(new StringBuffer("abc"));
	t.add(new StringBuffer("bcd"));
	t.add(new StringBuffer("bbb"));
	t.add(new StringBuffer("AAA"));
	t.add(new StringBuffer("DBe"));
	
	t.add(new StringBuffer("abc"));
	
	System.out.println(t);
	}
}
class MyComparator_ implements Comparator
{
	public int compare(Object a,Object a1)
	{
		String s = a.toString();
		String s1 =a1.toString();
		return s.compareTo(s1);
	}
	}

