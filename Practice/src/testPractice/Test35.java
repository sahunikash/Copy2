package testPractice;

public interface Test35 
{
	int i=0;
	String s ="value of i";
	void test();
	void yesy1();
}
abstract class testtt implements Test35
{
	
	public void test()
	{
		
		System.out.println(s);
		System.out.println(i);
	}
	public void yesy1()
	{
		System.out.println(s);
		System.out.println(i);
	}
	public abstract int test2();
	}
class last extends testtt
{
	

	public static void main(String[] args) 
	{
		last t = new last();
		t.test();
		t.test2();
		t.yesy1();
	}
	
	public int test2()
	{
		System.out.println();
		System.out.println();
		return 10;
	}



}
