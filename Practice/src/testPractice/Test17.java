package testPractice;

public class Test17 
{
public static void main(String[] args) 
{
	Object o = new Object();
	Thread t = new Thread("nikash");
	String s = new String("nikash");
	System.out.println(o==t);
	System.out.println(o==s);
	//System.out.println(t==s);
	System.out.println(t.equals(s));
}
}
