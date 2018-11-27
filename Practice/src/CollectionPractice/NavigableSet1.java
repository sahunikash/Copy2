package CollectionPractice;

import java.util.Comparator;
import java.util.TreeSet;

public class NavigableSet1 
{
	public static void main(String[] args)
	{
		TreeSet t = new TreeSet(new DD());
		t.add(12);
		t.add(1);
		t.add(123);
		t.add(65);
		t.add(76);
		System.out.println(t);
		
	}

}
class DD implements Comparator
{
	public int compare(Object o1,Object o2)
	
	{
		Integer I1 = (Integer)o1;
		Integer I2 = (Integer)o2;
		
	return I1.compareTo(I2);
	
		
	}
	}
