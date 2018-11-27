package ThreadPractice;

public class JoiN2 extends Thread
{
public static void main(String[] args) 
{
	JoiN2 j = new JoiN2();
	j.start();
	try{j.join();}
	catch(Exception e)
	{}
	System.out.println("main");
	JoiN2 j1 = new JoiN2();
	j1.start();
	
	JoiN2 j2 = new JoiN2();
	j2.start();
}
public void run()
{

for(int i =0;i<=3;i++)
{
	System.out.println(i);
	}
	}




}

