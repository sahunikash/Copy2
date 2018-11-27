package ThreadPractice;
class Threadp41 implements Runnable 
{
	public void run()
	{
		Thread.currentThread().setName("this child thread");
		for(int i = 0; i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}


public class ThreadP4 
{
	public static void main(String[] args) 
	{
		Threadp41 tp = new Threadp41();
		Thread t = new Thread(tp);
		t.setPriority(10);
		t.start();
		//t.setPriority(7);

		for(int i =0; i<=5 ; i++)
		{
			System.out.println("main thread");
		}
		
	}

}
