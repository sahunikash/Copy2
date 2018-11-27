package ThreadPractice;
class Threadp53 extends Thread
{
	public void run ()
	{
		System.out.println("child thread");
	}
	}
class Thr extends Threadp53
{
public void run()
{
	System.out.println("from Thr");
	}
}


public class ThreadP5 
{
	public static void main(String[] args) 
	{
		Threadp53 tr = new Threadp53();
		System.out.println("main Thread");
		tr.setPriority(6);
		tr.start();
		Threadp53 tr2 = new Threadp53();
		tr2.setPriority(3);
		tr2.start();
		Thr th = new Thr();
		th.setPriority(7);
		th.start();
		
		
	}
}
