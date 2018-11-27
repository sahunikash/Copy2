package ArrayPractice;

public class Test9 
{
public static void main(String[] args) 
{
	int arr[] = {20,1,3,5,7,21};
	int min =arr[0];
	int m=0;
	int l = arr.length;
	for(int i =0;i<arr.length;i++)
	{
		if(min>arr[i])
		{
			min=arr[i];
			m=i;
		}
		else{
			System.out.println("else");
		}
		
	}
	int S_min = arr[l-m-1];
	for(int j =0;j<arr.length;j++)
		
	{
		
		if(S_min>arr[j] &&m!=j)
		{
			S_min=arr[j];
			
		}
	}
	System.out.println(S_min);
			
	
}
}
