package ArrayPractice;

public class Test10 
{
public static void main(String[] args) 
{
	int a [] = {1,0,2,0,3,3,3,1};
	int total =0;
	for(int i = 0;i<a.length;i++)
	{
		total=total+a[i];
		System.out.println(a[i]);
	}
	System.out.println(total);
}
}
