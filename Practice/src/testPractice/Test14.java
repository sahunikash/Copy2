package testPractice;

public class Test14 
{
	public static void m1(int i)
	{
		System.out.println("from m1");
		
	}
	public static void m1(int...i)
	{
		System.out.println("var-args");
	}
public static void main(String[] args) 
{
	m1();
	m1(10);
	m1(39);
	
	
}
}
