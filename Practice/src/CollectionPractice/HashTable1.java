package CollectionPractice;

import java.util.Hashtable;

public class HashTable1
{
	public static void main(String[] args) {
		
	
	Hashtable h = new Hashtable();
	h.put(new temp(1),"ngd");

	h.put(new temp(3)," value");
	h.put(new temp(5), "value");
	h.put(new temp(2), "value11");
	h.put(new temp(8),"valuevalue");
	System.out.println(h);
	h.put(1, "va");
	h.put(10,"mmm");
	
	}
}
class temp
{
	int i ;
	String s;
	public temp(int i)
	{
		this.i=i;
		//this.s=s;
		
		
	}
	public int hashcode()
	{
		return i;
	}
	public String toString()
	{
		return i +"";
	}
	



}
