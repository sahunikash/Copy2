package ThreadPractice;

public class DeaadLock 
{
	
	

public static void main(String[] args)
{
	 final mainClass s1 = new mainClass();
	 
     final mainClass s2 = new mainClass();

     Thread t1 = new Thread()
 {public void run(){s1.method1(s2);}};

     Thread t2 = new Thread()
     {
         @Override
         public void run()
         {
             s2.method2(s1);
         }
     };

     t1.start();

     t2.start();
}
}

class mainClass extends Thread 
{

	synchronized void method1(mainClass d)
	{
		System.out.println(Thread.currentThread().getName());
		method2(this);
		System.out.println("method 1");
	}

	synchronized void method2(mainClass d)
	{
		System.out.println(Thread.currentThread().getName());
		method1(this);
		System.out.println("method 2");
	}

	
}



