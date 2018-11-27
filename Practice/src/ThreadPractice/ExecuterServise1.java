package ThreadPractice;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class jobs implements Runnable
{
	String name ;
	jobs(String name)
	{
		this.name=name;
	}
	
	public void run()
	{
		System.out.println(name +"..jobs execute by thread   "+Thread.currentThread().getName());
		try{
			Thread.sleep(500);
		}catch(InterruptedException e)
		{}
		//System.out.println(name +"..jobs Execution done by thread   " + Thread.currentThread().getName());
	}
	}


public class ExecuterServise1
{
	public static void main(String[] args) 
	{
		
	
jobs [] jobs1 = {new jobs ("nilkas"),
		        new jobs ("Nikash"),
		        new jobs ("NIkash2"),
		        new jobs ("nikash3"),
		        new jobs ("nikash4"),
		        new jobs ("nikash5")};

ExecutorService service = Executors.newFixedThreadPool(3);


for(jobs job :jobs1 )
{
	service.submit(job);
	}
service.shutdown();
   }
}

