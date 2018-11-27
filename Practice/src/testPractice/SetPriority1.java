package testPractice;

class MyThread1 extends Thread
{
	public void run()
	{
		for(int i =0; i<10;i++)
		{
			System.out.println("child Thread");
		}
	}
	}
public class SetPriority1
{
public static void main(String[] args)
{
	MyThread1 t = new MyThread1();
	//Thread.currentThread().setPriority(8);
	t.setPriority(10);
	t.start();
	for(int i =0; i<10;i++)
	{
		System.out.println("main Thread");
	}
	}
}
