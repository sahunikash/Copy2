package cursors;
import java.util.*;
public class IteratorDemo 
{
public static void main(String[] args) 
{
ArrayList al= new ArrayList();
for(int i =0; i<=10; i++)
{
	al.add(i);
	}
System.out.println(al);
Iterator itr = al.iterator();
while(itr.hasNext())
{
	Integer intr = (Integer)itr.next();
	if(intr % 2 ==0)
	{
		System.out.println(intr);
	}
	else{
		itr.remove();
	}
		}
System.out.println(al);
}
}
