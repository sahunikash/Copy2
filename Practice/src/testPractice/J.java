package testPractice;

public class J 
{ static int x =5;
	static void test1()
	{
		System.out.println("test1:" + x);
		x=2;
	}
	static void test2()
	{
		System.out.println("test2:" +x);
		x =8;
		
	}
	public static void main(String[] args)
	{
		test1();
		System.out.println("main1:" + x);
		test2();
		System.out.println("main2:" + x);
	}

}
