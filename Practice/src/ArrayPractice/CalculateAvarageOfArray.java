package ArrayPractice;

public class CalculateAvarageOfArray 
{
	public static void main(String[] args) 
	{
		int a [] = new int[]{12,333,54,6,7,8,0,07667,67};
		int sum =0;
		for(int i =0;i<a.length;i++)
		{
			sum =sum+a[i];
		}
		System.out.println(sum/a.length);
	}

}
