package ThreadPractice;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo 
{
	public static void main(String[] args) throws Exception
	{
		CountDownLatch c = new CountDownLatch(4);
		Worker w = new Worker(100,c,"hello");
		Worker w1 = new Worker(200,c,"hello all");
		Worker w2 = new Worker(300,c,"hi");
		Worker w3 = new Worker(400,c,"hii all");
		w.start();
		w1.start();
		w2.start();
		w3.start();
		c.await();
		
		System.out.println(Thread.currentThread().getName());
		
	}

}
class Worker extends Thread
{
	int delay;
	CountDownLatch c;
	Worker (int delay,CountDownLatch c,String name)
	{  
		super(name);
		this.delay=delay;
		this.c=c;
		
		
	}
	public void run()
	{
		try{
			System.out.println(10);
			Thread.sleep(1000);
			System.out.println("run");
			c.countDown();
			System.out.println(Thread.currentThread().getName() +"  finished");
			//System.out.println("run");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	




}
