package CollectionPractice;

import java.util.LinkedList;

public class LinkedList1 
{

	public static void main(String[] args) 
	{
		LinkedList LL = new LinkedList();
		
		LL.add(1);
		LL.add(3);
		LL.add('A');
		LL.add("nnnnn");
		LL.add(null);
		LL.add(6);
		System.out.println(LL);
		LL.set(1, "element");
		System.out.println(LL);
		LL.add(0,"thisis" );
		System.out.println(LL);
		LL.removeLast();
		System.out.println(LL);
		LL.addFirst("recently added");
		System.out.println(LL);
		LL.getFirst();
		System.out.println(LL.getFirst()+"<.....>"+ LL.getLast());
	}
}
