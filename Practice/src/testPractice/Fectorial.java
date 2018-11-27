package testPractice;

public class Fectorial {

	public static void main(String[] args) 
	{
		int n =5;
		int count = 1;
		for(int i=1; i<=n;i++)
		{
			count =i*count;
			System.out.println(count+"---"+i);
		}
		System.out.println("final--"+count);
		
	}

}
