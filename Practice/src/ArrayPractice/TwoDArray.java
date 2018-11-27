package ArrayPractice;


public class TwoDArray 
{
public static void main(String[] args) 
{
	int [] [] a = {{1,2,3},{123,245,765}};
	//System.out.println(a[0][0]);
	
	for(int i =0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.println(a[i][j] + "\t");
		}
	}
	System.out.println();
	
}
}
