package ThreadPractice;
class counter
{
	int count;
	public void count()
	{
		count++;
	}
	}

public class SyncDemo 

{
	public static void main(String [] args){
		counter c = new counter();
	Thread t = new Thread(new Runnable()
	                                   {public	void run()
	                                   {
	                                	for(int i=1;i<100;i++)
			                                    c.count();
	                                   }
			                                               });
	
	t.start();
	System.out.println(c.count);
	System.out.println(Thread.currentThread().getName());
	
	Thread t1 = new Thread(new Runnable()
    {public	void run()
    {
 	for(int i=1;i<100;i++)
             c.count();
    }
                        });
	t1.start();
	System.out.println(c.count);
	}

}
