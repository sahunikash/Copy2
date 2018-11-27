package CollectionPractice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue2 
{
	public static void main(String[] args) 
	{
		
		PriorityQueue pq = new PriorityQueue(12,new OFF());
		pq.offer("f");
		pq.offer("hdgd");
		pq.offer("YY");
		pq.offer("aa");
		pq.add("ABB");
		pq.offer("AAAA");
		System.out.println(pq);
	}

}
class OFF implements Comparator
{
	
	public int compare(Object o1,Object o2)
	{
		String s = o1.toString();
		String s1 = o2.toString();
		return s1.compareTo(s);
		
	}





}
