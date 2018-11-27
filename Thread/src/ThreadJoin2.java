
class test extends Thread

{
	static Thread mt ;
	public void run()
	{
		try{
			System.out.println("child thread");
			mt.join();
		}
		catch(InterruptedException e)
		{
			
		}
	}
}
public class ThreadJoin2 
{
public static void main(String[] args) 
{
	test.mt=Thread.currentThread();
	test t = new test();
	t.start();
	try{
		System.out.println("main thread");
	t.sleep(20000);
	}
	catch(InterruptedException e)
	{
		
	}
}
}
