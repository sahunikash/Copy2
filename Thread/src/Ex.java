 class TT extends Thread 
 {
	 public void run()
	 {
		 for(int i =0; i<10;i++)
		 {
			 System.out.println("chhild Thread");
		 }
	 }
 }

public class Ex 
{
	public static void main(String[] args) {
		
		TT t = new TT();
		t.start();
		for(int i =0; i<10;i++)
		{
			System.out.println("main thread");
		}
	}

}
