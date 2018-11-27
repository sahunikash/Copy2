package CollectionPractice;

import java.util.HashSet;

public class HashSet2 
{
public static void main(String[] args) 
{
	HashSet h = new HashSet();
	for(int  i =0;i<100;i++)
	{
		h.add(i);
		//System.out.println(i);
		h.remove(i-1);
		//System.out.println(h.remove(i-1));
		System.out.println(i);
	}
	//System.out.println(h.size());
}
}
