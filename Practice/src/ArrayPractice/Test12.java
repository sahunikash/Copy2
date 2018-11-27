package ArrayPractice;

public class Test12 
{
public static void main(String[] args) 
{
	int a [] [] ={{1,3,4,5,5},{3,4,5,6,7,8}};
	int total=0;
	for(int i =0;i<a.length;i++)
	{
		for(int j =0;j<a[i].length;j++)
		{
			total= total+a[i][j];
			System.out.println(a[i][j]);
		}
		System.out.println("hello");
	}
	System.out.println(total);
}
}
