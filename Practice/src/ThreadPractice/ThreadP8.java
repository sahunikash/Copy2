package ThreadPractice;

class ThreadA extends Thread
{
	//ThreadA a =  new ThreadA();
	int total;
	public void run()
	{
		System.out.println("this is child thread");
		synchronized (this)
		{
			System.out.println("child thread start notification");
			for(int i =0;i<=10;i++)
			{
				total=total+i;
				System.out.println(i);
			}
			System.out.println("child thread try to give notification");
			this.notify();
		}
		System.out.println("10");
	}
	}
public class ThreadP8  extends ThreadA
{
public static void main(String[] args) throws Exception
{
	ThreadA t = new ThreadA();
t.wait();
	t.start();
	//t.wait();
	
	synchronized(t)
	{
		System.out.println("main thread trying to call wait() method");
		//t.wait();
		System.out.println("main thread called wait method");
		//t.wait(100);
		System.out.println("main thread got notification");
		System.out.println(t.total);
	}
	
	
}
}
