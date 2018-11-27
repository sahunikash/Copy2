package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Search1 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("12");
		al.add("98");
		al.add("Nnn");
		al.add("anha");
		al.add("NNN");

		al.add("aaaaa");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(Collections.binarySearch(al, "Nnn"));
		System.out.println(Collections.binarySearch(al,"A"));
		
		
	}

}
