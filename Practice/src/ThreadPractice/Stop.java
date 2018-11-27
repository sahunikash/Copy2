package ThreadPractice;

class Threrrr extends Thread
{
	private volatile boolean flag=true;
	
	
	synchronized void  stopRunning(Threrrr t)
	{
		flag =false;
		Thread.currentThread().setName("hello0");
		System.out.println(Thread.currentThread().getName());
	}
	public void  run()
	{
		
		
		while(flag)
		{
			System.out.println("i m running");
		}
		Thread.currentThread().setName("hello02");
		System.out.println(Thread.currentThread().getName());
		System.out.println("running stop");
		}
	
	
}

public class Stop 
{
 public static void main(String[] args) 
 {
	
	 Threrrr t = new Threrrr();
	 
	
	 t.start();
	 
	 Thread.currentThread().setName("hello01");
	 System.out.println(Thread.currentThread().getName());
	 
	 
	 
	 t.stopRunning(t);
}
	
	
	
	
	
}
