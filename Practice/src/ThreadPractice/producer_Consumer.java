package ThreadPractice;
class pr extends Thread
{
	public void run()
	{
		System.out.println("run()");
	synchronized (this)
	{
		int i =20;
		System.out.println(i);
		this.notify();
		
	}
	
	
	}
	}

public class producer_Consumer 
{
public static void main(String[] args) 
{
	Thread t = new Thread();
	t.start();
	synchronized (t)
	{
		try{
		t.wait();
		int i=10;
		System.out.println(i);
		//t.wait();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
}
