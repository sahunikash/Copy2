package testPractice;



class My extends Thread
{
	}

public class ThreadPriority {

	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		My t = new My();
		System.out.println(Thread.currentThread().getPriority());
		
	}
}
