package testPractice;

public class factorial2 
{
public static void main(String[] args)
{
	int arr[] ={1,2,4,5,7};
    int total=1;
	for(int i=0;i<arr.length;i++)
	{
		total =total+total;
		System.out.println(total +"....."+ i);
		}
	
	}
}
