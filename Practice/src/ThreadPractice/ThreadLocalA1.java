package ThreadPractice;

public class ThreadLocalA1 
{
public static void main(String [] args)
{
	ThreadLocal tl = new ThreadLocal()
	{ 
		public Object initialValue()
		{
			return 10;
		}
	};
	System.out.println(tl.get());
	tl.set("hello 0");
	System.out.println(tl.get());
	tl.remove();
	System.out.println(tl.get());
	}
}
