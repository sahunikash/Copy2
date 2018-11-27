
class test123 extends Thread
{
	public void run()
	{
		for (int i =0; i<10;i++)
		{
			System.out.println("child thread");}
			System.out.println("child wants to sleep");
			try{
				Thread.sleep(20000);
				System.out.println("child sleepin now ");
				
			}catch(InterruptedException e)
			{
				System.out.println("child gotr Interpted");
			}
		}
	}
public class Thread12_inerroptt 
{
public static void main(String[] args) 
{
	test123 t = new test123();
	t.start();
	t.interrupt();
	System.out.println("end of main");
}
}
