class test1 extends Thread
{
	public void run()
	{
		try{
			for(int i =10; i<10;i++)
			{
			System.out.println("i m a lazy Thread");
			Thread.sleep(20);
			}
		} catch(InterruptedException e)
		{
			System.out.println("i got Interrupted");
			
		}
	}
	}

public class Thread_Inturrupt 
{
	public static void main(String[] args) 
	{
		test1 t = new test1();
		t.start();
		t.interrupt();
		System.out.println("end of main");
	}

}
