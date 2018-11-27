package ArrayPractice;

public class GFG 
{
	public static void main(String[] args) 
	{
		GFG g = new GFG();
		int arr [] ={1,3,5,6,7,7};
		int arr1 [] ={1,3,5,5,7,8,9,9};
		int m = arr.length;
		int m1= arr.length;
		
		
		if(g.Subset1(arr,arr1,m,m1))
				{
			System.out.println("array is subset of arr1");
				}
		else {
			System.out.println("array is not a sub set of arr1");
		}
	}
	public  boolean Subset1(int arr[],int arr1[],int m,int m1)
	{
		int i =0;
		int j =0;
		for(i=0;i<m1;i++)
		{
			for(j=0;j<m;j++)
				if(arr==arr1)
					break;
			
		if(j==m)
			return false;
		}
		return true;
		
		
	}

}
