package ThreadPractice;

class MyThread12 implements Runnable
{
	int i;
	public void run()
	{
	
		for(int j =1;j<=100;j++)
		{
		count();
		}
	System.out.println(Thread.currentThread().getName());
	}
	public synchronized void count()
	{
		//System.out.println(i);
		i++;
		//System.out.println(i);
		
	}
	

}
public class  ThreadP10 
{
	public static void main(String[] args) 
	{
		MyThread12 t = new MyThread12();
		Thread t1 = new Thread(t);
		t1.start();
		//System.out.println(t1);
		Thread t2 = new Thread(t);
		for(int j =1;j<=100;j++)
		{
		t.count();
		}
		Thread t3 = new Thread(t);
		for(int k =0;k<=100;k++)
		{
			t.count();
		}
		System.out.println(t.i);
	}
	
}
