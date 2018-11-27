package testPractice;

public class Static_Block 
{
	static int i=10;
	static {
		m1();
			System.out.println("1st static block");
	}
	
	public static void main(String[] args)
	{
		m1();
		System.out.println("from main method");
	}
	public static void m1()
	{
		System.out.println(j);
	} 
	static {
		System.out.println("second static block");
		
	}
	static int j=20; 
}
