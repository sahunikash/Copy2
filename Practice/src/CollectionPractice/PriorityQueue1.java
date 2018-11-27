package CollectionPractice;

import java.util.PriorityQueue;

public class PriorityQueue1 
{
	public static void main(String[] args) 
	{
		PriorityQueue p = new PriorityQueue();
		System.out.println(p);
		for(int i=1;i<=10;i++)
		{
			p.add(i);
			p.offer(i);
		}
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p.peek());
		System.out.println(p.remove());
		System.out.println(p);
		
		
	}

}
