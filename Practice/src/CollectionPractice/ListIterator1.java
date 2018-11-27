package CollectionPractice;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator1 
{
	public static void main(String[] args) 
	{
		LinkedList LL = new LinkedList();
		LL.add("abs");
		LL.add("acb");
		LL.add("aabc");
		LL.add("abc");
		LL.add("vvv");
		LL.add("Abcd");
		System.out.println(LL);
		ListIterator l = LL.listIterator();
		//System.out.println(l);

		
		
		while(l.hasNext())
		{
			String s = (String)l.next();
			System.out.println(s);
			if(s.equals("abs"))
			{
				l.remove();
				//System.out.println(l);
				System.out.println(LL);
				
			}
			if(s.equals("vvv"))
			{
				l.set("hello");
				//System.out.println(l);
				System.out.println(LL);
			}
			if(s.equals("abs"))
			{
				l.add("ABC");
				//System.out.println(l);
				System.out.println(LL);
			}
		}
		System.out.println(LL);
		
	}

}
