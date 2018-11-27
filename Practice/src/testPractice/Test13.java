package testPractice;

public class Test13 
{
	public static int m2(int...i)
	{
		int total =0;
		for(int y :i)
		{
			total =total+y;
		}
		System.out.println(total);
		return 0;
	}
public static void main(String[] args) 
{
	m2(10);
	m2(20);
	m2(98);
}
}
