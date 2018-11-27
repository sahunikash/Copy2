package CollectionPractice;

import java.util.Vector;

public class Vector1
{
public static void main(String[] args)
{
	Vector v = new Vector();
	System.out.println(v.capacity());
	for(int i =0;i<=10;i++)
	{
		v.addElement(i);
	}
	System.out.println(v.capacity());
	v.addElement('A');
	System.out.println(v.capacity());
	System.out.println(v);
	System.out.println(v.size());
	v.remove(8);
	System.out.println(v);
	v.add(16);
	v.add(8, 'N');
	System.out.println(v);
	v.removeElementAt(0);
	System.out.println(v);

}
}
