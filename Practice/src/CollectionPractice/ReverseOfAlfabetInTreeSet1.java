package CollectionPractice;

import java.util.Comparator;
import java.util.TreeSet;

public class ReverseOfAlfabetInTreeSet1
{
	public static void main(String[] args) 
	{
		TreeSet t = new TreeSet(new MyComparator1());
		t.add("a");
		t.add("c");
		t.add("v");
		t.add("b");
		t.add("y");
		
		System.out.println(t);
	}

}
class MyComparator1 implements Comparator
{
	public int compare(Object o,Object o2)
	{
		String s = (String)o;
		String s1= (String)o2;
		return s1.compareTo(s);
	}
	
}
