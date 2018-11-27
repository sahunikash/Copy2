package ThreadPractice;
class Thread6pp extends Thread
{
	public void run()
	{
		int sum=10;
		for(int i =0;i<10;i++)
		{
			try{
			Thread.sleep(1000);
			sum=sum+i;
			Thread.yield();
			
		System.out.println("child Thread");
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println(sum);
	}
	}

public class Thread6P 
{
public static void main(String[] args) throws Exception
{
	Thread6pp t = new Thread6pp();
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.println("hello");
		}
	}
	//t.start();
	t.join();
	System.out.println("main Thread");
	Thread6pp t2 = new Thread6pp();
	{
		for(int i =0;i<=3;i++)
		{
			System.out.println("hii");
		}
	}
	t2.start();
	//t2.join();
	
	
}
}
