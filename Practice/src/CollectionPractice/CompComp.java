package CollectionPractice;

import java.util.Comparator;
import java.util.TreeSet;

class employee implements Comparable
{
	int i;
	employee(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "E-" +i;
	}
	public int compareTo(Object o)
	{
		int i1=this.i;
		employee e1=(employee)o;
		int i2 = e1.i;
		if(i1<i2)
		{
			return -1;
		}
		else if(i1>i2)
		{
			return +1;
		}
		else {
			return 0;
		}
	}
	}

public class CompComp 
{
	public static void main(String[] args) 
	{
		employee e1 = new employee(100);
		employee e2 = new employee(400);
		employee e3 = new employee(200);
		employee e4 = new employee(700);
		employee e5 = new employee(500);
		employee e6 = new employee(400);
		
		TreeSet t1 = new TreeSet();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		t1.add(e6);
		
		System.out.println(t1);
		
		TreeSet t2 = new TreeSet(new DO1());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		t2.add(e6);
	
		System.out.println(t2);
		
		
		
		
	}

}
class DO1 implements Comparator
{

	public int compare(Object o1,Object o2)
	{
		employee e1 = (employee)o1;
		employee e2 = (employee)o2;
		 //return e2.compareTo(e1);
		 //System.out.println(e2.compareTo(e1));
		 return e2.compareTo(e1);
	}




}