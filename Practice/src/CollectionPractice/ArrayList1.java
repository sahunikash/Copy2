package CollectionPractice;

import java.util.ArrayList;

public class ArrayList1 
{
public static void main(String[] args) 
{
	ArrayList al = new ArrayList();
	al.add(1);
	al.add("nikash");
	al.add(2);
	al.add('a');
	al.add('d');
	al.add('b');
	al.add('c');
	al.add(24);
	al.add("sahu");
	al.add(10);
	System.out.println(al);
	al.remove(1);
	al.remove(8);
	System.out.println(al);
	al.add(1, "hello");
	al.add(8," element");
	System.out.println(al);
	System.out.println(al.size());
	al.clear();
	System.out.println(al);
	al.addAll(al);
	System.out.println(al);
	//al.set(1, 'e');
	
	
}
}
