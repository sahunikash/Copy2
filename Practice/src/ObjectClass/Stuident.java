package ObjectClass;

import org.omg.Messaging.SyncScopeHelper;

public class Stuident 
{
	private String s;
	private int i;
	Stuident(String s,int i)
	{
		this.s=s;
		this.i=i;
	}
	
	public String toString()
	{
		return s +"---"+i;
	}
	
public static void main(String[] args) 
{
	Stuident s = new Stuident("hello",1);
	Stuident s1 = new Stuident("hii",2);
	
	System.out.println(s);
	System.out.println(s.toString());
	System.out.println(s1);
}
}
