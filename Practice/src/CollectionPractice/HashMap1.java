package CollectionPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class HashMap1 
{
	public static void main(String[] args) 
	{
		HashMap h = new HashMap();
		h.put(1,"Abc");
		h.put(2, "BCD");
		h.put(3,"hgdd");
		h.put(2, "a");
		h.put(4, "value");
		h.put(5, "va");
		h.put(6,"lue");
		System.out.println(h);
	 
		Set s = h.keySet();
		
		System.out.println(s);
		Collection c = h.values();
		System.out.println(c);
		Set s1 = h.entrySet();
		System.out.println(s1);
		Iterator itr =s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"------" +m1.getValue());
			if(m1.getKey().equals(2))
			{
				m1.setValue("new");
			}
			
		}
		System.out.println(h);
		
		
	}

}
