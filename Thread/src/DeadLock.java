
class A
{
	public synchronized void  d1(B b)
	{
		System.out.println("Thread1 start execution of d1() method");
	
	try{
		Thread.sleep(2000);
	}catch(InterruptedException e)
	{
		
	}
	System.out.println("Thread1 Trying to call last() mathod");
	b.last();
	
	}

public synchronized void last()
{
	System.out.println("inside A,last() method");
	}
}
class B
{
	public synchronized void d2( A a)
	{
		System.out.println("Thread2 starts execution of d2() method");
		try{
			Thread.sleep(20000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Thread2 tryingto call last() method");
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside b,last()method");
	}
	}
	
	
public class DeadLock extends Thread
{
 A a = new A();
 B b = new B();
 public static void main(String[] args)
 {
	DeadLock Dl = new DeadLock();
	Dl.m1();
}
 public void m1()
 {
	 this.start();
	 a.d1(b);//main Thread//
 }
 public void run()
 {
	 b.d2(a);//child Thread//
 }
}
