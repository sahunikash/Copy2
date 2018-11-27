package ThreadPractice;
class demo2 extends Thread
{
	private static Integer id=0;
	private static ThreadLocal tl = new ThreadLocal()
			{
	 protected Integer initialValue()
		{
			return ++id;
		}
			};
			demo2(String name)
			{
				super(name);
			}
			public void run()
			{
				System.out.println(tl.get()+"THread executing");
			}
	}
public class ThreadLocalA2 
{
	public static void main(String[] args) {
		
	
demo2 d = new demo2("Byte:-128to127");
demo2 d1 = new demo2("Short:-2^15to2^15-1");
demo2 d2 = new demo2("int:-2^31to2^31-1");
demo2 d3 = new demo2("Long:-2^63to2^63-1");
demo2 d4 = new demo2("float");
demo2 d5 = new demo2("Double");
demo2 d6 = new demo2("Char");

d.start();
d1.start();
d2.start();
d3.start();
d4.start();
d5.start();
d6.start();
	}



}
