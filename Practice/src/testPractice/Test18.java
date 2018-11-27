package testPractice;

public class Test18 
{
public static void main(String[] args) 
{
	Test18 t = new Test18();
	Thread t1 = new Thread();
	System.out.println(t instanceof Test18);
	System.out.println(t1 instanceof Object);
	System.out.println(t instanceof Object);
	System.out.println(t1 instanceof Thread);
}
}
