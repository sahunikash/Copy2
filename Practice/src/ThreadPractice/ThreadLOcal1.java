package ThreadPractice;

public class ThreadLOcal1 
{
public static void main(String [] args)
{
	ThreadLocal tl = new ThreadLocal();
	System.out.println(tl.get());
	tl.set("newly added");
	System.out.println(tl.get());
	tl.remove();
	System.out.println(tl.get());
	}
}
