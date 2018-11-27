package ThreadPractice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class callableDemo implements Callable
{ int num;
callableDemo(int num)
{ this.num=num;
	}
  public Object call() throws Exception
  {
	  int sum=0;
	  for(int i =0;i<=num;i++)
	  {
		  sum=sum+i;
	  }
	  return sum;
  }
	
	
	}
public class Callable$Future
{
public static void main(String[] args) throws InterruptedException, ExecutionException 
{
	callableDemo [] c = {new callableDemo(10),
			             new callableDemo(12),
			             new callableDemo(20),
			             new callableDemo(30),
			             new callableDemo(54),
			             new callableDemo(11)
			             };	
	ExecutorService s = Executors.newFixedThreadPool(3);
	for(callableDemo c1:c)
	{
		Future f = s.submit(c1);
		System.out.println(f.get());
	}
	s.shutdown();
}
}
