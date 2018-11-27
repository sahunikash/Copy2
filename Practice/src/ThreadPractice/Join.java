package ThreadPractice;

public class Join extends Thread
{
	public void run()
	{
		//System.out.println("run");
		System.out.println(Thread.currentThread().getName());
	}
	
	
public static void main(String[] args)throws Exception 
{
	
	//System.out.println();
	Join j = new Join();
	Thread t = new Thread(j);

	t.start();

	t.join();
	System.out.println("main thread");
	
	Thread t1 =new Thread(j);
	t1.start();
	t1.join();
	System.out.println("main thread2");
}


}
