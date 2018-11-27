package ArrayPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting2 
{
	public static void main(String[] args) 
	{
		Object [] g = new Object[5];
		g[0] = 10;
		g[1] =98;
		g[2]=6;
		g[3]=54;
		g[4]=9;
	
		List l = Arrays.asList(g);
		System.out.println(l);
		for(Object i :g)
		{
		System.out.println(i);
		//g[6]=988;
		
		}	
	Arrays.sort(g, new DD());
	for(int i =0;i<g.length;i++)
	{
	System.out.println(g[i]);
	}
	}

}
class DD implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		/*Object a = (Object)o1;
		Object a1 = (Object)o2;
		
		return ((String) a1).compareTo((String) a);*/
		String s = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s);
		
	}
}
