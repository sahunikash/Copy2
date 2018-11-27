package ThreadPractice;
class Display
{
	public synchronized void m1(String name)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("m1()");
			try{
				Thread.sleep(1000);
				Thread.interrupted();
			}
			catch(Exception e)
			{
				System.out.println("intterupted");
			}
			}
		System.out.println(name);
		}
		
	
	public void m2()
	{
		
		System.out.println("nonSync m2()");
		
	}
	}
class DisplayDemo extends Thread
{
	Display d;
	String name;
	DisplayDemo(Display d,String name)
	{
		this.d=d;
		this.name = name;
		try{
			Thread.sleep(1000);
		
		System.out.println("displayDemo");
		}catch(Exception e)
		{
			System.out.println("Inturpted");
		}
		
	}
	public void run()
	{
		System.out.println("run");
		d.m1(name);
		d.m2();
	}
	}

public class ThreadP7 {
	public static void main(String[] args) 
	{
		Display d = new Display();
		Display d2 = new Display();
		DisplayDemo dd1 = new DisplayDemo(d, "niku");
		//DisplayDemo dd2 = new DisplayDemo(d2, "nikash");
		DisplayDemo dd3 = new DisplayDemo(d, "nikash sahu");
		dd1.start();
	    //d.start();
	   dd3.start();
	    //d2.m2();
	    dd1.interrupted();
		
	}

}
