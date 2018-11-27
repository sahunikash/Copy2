package ThreadPractice;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

class share 
{

	synchronized void methodone(share s)
	{
		System.out.println(Thread.currentThread().getName());
		
		try{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		s.methodtwo(this);
	}
	
	synchronized void methodtwo(share s)
	{
		System.out.println(Thread.currentThread().getName());
		try{
			Thread.sleep(2000);
		}catch(Exception e)
		{}
		s.methodone(this);
	}

}


public class DetectDeadLock {
	
	public static void main(String[] args) 
	{
		share s = new share();
		share s1 = new share();
		
		Thread t1 = new Thread()
				{
			public void run()
			{
			s.methodone(s1);	
			}
				};
				
				
				
	Thread t2 = new Thread()
			{
		public void run()
		{
			s1.methodtwo(s);
		}
			};
	t1.start();
	t2.start();
	
	ThreadMXBean mb =ManagementFactory.getThreadMXBean();
	
	long[] id = mb.findMonitorDeadlockedThreads();
	if(id!=null)
			{
		ThreadInfo ti []=mb.getThreadInfo(id);
//		for(int i =0;i<ti.length;i++)
//		{
//			System.out.println(ti[i].getThreadId());
//		    System.out.println(ti[i].getThreadName());
//			}
		
		
		for(ThreadInfo t :ti)
		{
			System.out.println(t.getThreadId());
			System.out.println(t.getThreadName());
			System.out.println(t.getLockName());
			System.out.println(t.getLockOwnerId());
			System.out.println(t.getLockOwnerName());
			
		}
		
			}
	else{
		System.out.println("no dead lock");
	}
	
	
	}
	
	
	
	
	

}
