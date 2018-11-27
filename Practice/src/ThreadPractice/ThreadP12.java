package ThreadPractice;



class count1 implements Runnable 
{
	int count;
	public void run() 
	{
		for(int i =0;i<=100;i++)
				
		{
			coun();
			//Thread.yield();
			
			try{
				Thread.sleep(10000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			}
			System.out.println(Thread.currentThread().getName());
		}
		
	
	

public synchronized void coun()
{
	count++;
	System.out.println(count);
	}
}



public class ThreadP12  extends count1
{
	public static void main(String[] args) throws Exception
	{
		count1 c = new count1();
		Thread t = new Thread(c);
		
		t.start();
		Thread t2 = new Thread(c);
		t2.start();
		System.out.println(c.count);
		//t2.join();
		
		
	}
	public void run()
	{
		for(int i=0;i<200;i++)
		{
			run();
			System.out.println("hello");
		}
	}
	

}
