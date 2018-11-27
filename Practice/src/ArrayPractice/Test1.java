package ArrayPractice;

public class Test1 
{
public static void main(String[] args) 
{
	sum(new int []{12,23,43});
}
public static void sum(int[] x)
{
	int total=0;
	for(int x1:x)
	{
		total=total+x1;
		
	}
	System.out.println(total);
}
}
