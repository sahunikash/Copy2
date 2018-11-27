package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ReVerse1 
{
public static void main(String[] args) 
{
	ArrayList al= new ArrayList();
	al.add(8);
	al.add("nhg");
	al.add("index,");
	al.add(98);
	al.add(9);
	al.add('e');
	al.add(876);
	System.out.println(al);
	Collections.reverse(al);
	System.out.println(al);
}
}
