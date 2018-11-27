
public class SingletonClass1 
{
	private static SingletonClass1  myobj;

	
	static {
		myobj = new SingletonClass1();
	}
	private SingletonClass1()
	{
		
	}
	public static SingletonClass1 getInstance()
	{
		return myobj;
	}
	public void test()
	{
		System.out.println("hello");
	}
	public static void main(String[] args)
	{
		
		SingletonClass1 sc = new SingletonClass1();
		sc.test();
		
	}
}
	
	
	
	
	

