package CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;



public class Iterator1 
{
	public static void main(String[] args) 
	{
		ArrayList l = new ArrayList();
		for(int i =0;i<=10;i++)
		{
			l.add(i);
			
		}
		System.out.println(l);
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			
			Integer in =(Integer)itr.next();
			if(in%2==1){
			System.out.println(in);
			}
		}
		System.out.println(l);
		
		
	}

}
