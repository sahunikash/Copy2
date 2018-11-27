package ThreadPractice;
class MyThreadP3 implements Runnable
{
	
	public void run()
	{
		Thread.currentThread().setName("this is child Thread");
		System.out.println(Thread.currentThread().getName());
		for(int i =0; i<10;i++)
		{
			//System.out.println(i);
			System.out.println("child thread");
			//Thread.currentThread().setName("this is child Thread");
			//System.out.println(Thread.currentThread().getName());
		}
	}
}


public class ThreadP3
{
public static void main(String[] args) 
{
	Thread.currentThread().setName("this is child Thread");
	System.out.println(Thread.currentThread().getName());
MyThreadP3 p= new MyThreadP3();
//Thread.currentThread().setName("This is Main Thread");
//System.out.println(Thread.currentThread().getName());
Thread p1 = new Thread(p);
//Thread p2 = new Thread();
p1.start();
//p2.start();
for(int i =0; i<5 ; i++)
{
	System.out.println("main Thread");}
System.out.println();
}
}
