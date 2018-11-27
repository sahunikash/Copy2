package ArrayPractice;

public class Test3 
{
public static void main(String[] args) 
{
	int a [] = {20,40,60,65,8,90,65,74,0,6,5,3,6,88,7,90,2,122,65,4,3,5,6,8,90,90};
	int max = a[0];
	int m=a.length/3;
	int l=a.length-m;
	for (int i =0;i<a.length/3;i++)
	{
		System.out.println("+");
		if(max < a[l])
		{
			max=a[l];
			
		}
		if(max < a[m])
		{
			max=a[m];
			
		}
		if(max < a[i])
		{
			max=a[i];
			
		}
		
		m++;
		l++;
	}
	System.out.println(max);
}
}
