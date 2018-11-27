package CollectionPractice;

import java.util.TreeSet;

public class NavigableSet2 
{
	public static void main(String[] args) 
	{
		
		TreeSet<Integer> t = new TreeSet();
		t.add(109);
		//t.add("");
		t.add(200);
		t.add(54);
		t.add(87);
		t.add(655);
		t.add(987);
		System.out.println(t);
		System.out.println(t.ceiling(87));
		System.out.println(t.higher(109));
		System.out.println(t.floor(87));
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		System.out.println(t.descendingSet());
	}

}
