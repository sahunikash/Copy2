
class mythread extends Thread
{
	public void run()
	{
	for(int i =0;i<5;i++)
	{
		System.out.println("child Thread");
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e )
		{
			
		}
	}
	}
	}
public class ThreadJoin {

	public static void main(String[] args) {
		mythread t = new mythread();
		t.start();
		try{
		t.join(1000);
		}catch (InterruptedException e)
		{
			
		}
		for(int i=0;i<5;i++){System.out.println("main Thread");
	}
		}
}
