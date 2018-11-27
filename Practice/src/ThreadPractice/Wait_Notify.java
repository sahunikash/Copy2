package ThreadPractice;

public class Wait_Notify extends Thread
{
	public static void main(String[] args) 
	{ try{
		ThreadBB b = new ThreadBB();
		b.start();
		Thread.sleep(1000);
		synchronized(b)
		{
			System.out.println("main thread try to call wait()");
			b.wait();
			//b.wait(1000);
			System.out.println("main method got notification");
			System.out.println(b.total);
		}
		}catch (Exception e)
		{
			System.out.println(e);
		}
		}
	}


class ThreadBB extends Wait_Notify
{
	
int total;

public void run()

{
	System.out.println("run");
	synchronized(this)
	{
	for(int i=0;i<10;i++)
	{
		total=total+i;
	}
	this.notify();
	
	
	
}
	}

	
	
}

	
	


