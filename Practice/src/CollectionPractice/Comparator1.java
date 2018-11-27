package CollectionPractice;


import java.util.Comparator;
import java.util.TreeSet;

public class Comparator1
{
	public static void main(String[] args) 
	{
		TreeSet t= new TreeSet(new myComparator());
		t.add(10);
		t.add(12);
		//System.out.println("C".compareTo("B"));
		t.add(11);
		t.add(30);
		t.add(16);
		t.add(12);
		System.out.println(t);
		
	}

}
class myComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer I = (Integer)obj1;
		Integer I2 = (Integer)obj2;
		//return I.compareTo(I2);
		//return I2.compareTo(I);
		return 0;
		
	}
		
	}

	
	
