package CollectionPractice;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 
{
	public static void main(String[] args) 
	{
		SortedSet s= new TreeSet();
		s.add(100);
		s.add(89);
		s.add(187);
		s.add(76);
		s.add(108);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet(108));
		System.out.println(s.tailSet(100));
		System.out.println(s.subSet(89, 108));

		System.out.println(s.comparator());
		
	}

}
