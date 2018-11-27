import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class NumReading 
{
	public  int[] readNum()throws Exception
	{
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		int i=Integer.parseInt(br.readLine());*/
		Scanner sc = new Scanner (System.in);
	int count =sc.nextInt();
	String s=sc.nextLine();
	int [] num = new int[count];
	//System.out.println(num);
	Scanner sc1 = new Scanner(s);
	for(int i =0;i<count;i++)
	{
		if(sc1.hasNextInt())
		{
			num[i]=sc1.nextInt();
			
		}
		else {
			
			System.out.println("u did not provide enough value");
			break;
			
			
		}
	}
	
	return num;
	
			
	}
	public static void main(String[] args) throws Exception
	{
		NumReading nu = new NumReading();
		
		int num [] = nu.readNum();
		System.out.println(Arrays.toString(num));
		
	}

}
