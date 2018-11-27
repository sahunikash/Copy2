package ThreadPractice;

 class ThreadDemo extends Thread
{

	public void run()
	{
		for(int i =0; i<=10;i++)
		{
			//System.out.println(i);
		System.out.println("Child Thread");
		}
	}
}
public class ThreadP1  extends ThreadDemo
{
	public static void main(String[] args) 
	{
		ThreadDemo t = new ThreadDemo();
		t.start();
		try{t.join();}catch(Exception e)
		{
			//System.out.println(e);
		}
		
		for(int i =0; i<=10;i++)
			
		{
			//System.out.println(i);
			System.out.println("Main Thread");
		}
		//t.start();
	}
	}
