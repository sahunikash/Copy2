import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class N_Num 
{
	public static void main(String[] args) throws Exception
	{
		//Scanner sc = new Scanner(System.in);
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int s=(Integer)sc.read();
		//System.out.println("enter num");
		//int s = sc.nextInt();
		for(int i=0;i<=s;i++)
		{
			System.out.println(i+" ");
		}
		
	}

}
