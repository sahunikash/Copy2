package testPractice;

 abstract class AbstractDemo12
{ 
	abstract void vehicle();
	}
public class Test28 extends AbstractDemo12
{
	public static void main(String[] args) 
	{
		Test28 ab = new Test28(); 
		ab.vehicle();
		
			
		
	}
	
		void vehicle()
{
		System.out.println("abstract");
	}
		

}
class testt extends AbstractDemo12
{
	void vehicle()
	{
		System.out.println(" from testt");
	}
	}

