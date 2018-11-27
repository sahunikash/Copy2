import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		//Scanner sc = new Scanner(System.in);
		
		String sc1 ="javatestlestseewhathappens";
		String [] a = {"jhdsk","kjsv"};
		System.out.println(sc1.length());
		int i =0;
		for(String sc : a)
		{
			System.out.println(sc);
			i =i+sc.length();
			
		}
		System.out.println(i);
		for(int k =0;k<sc1.length();k++)
		{
			System.out.println(sc1);
			//i=i+sc1.length();
			i =k+sc1.length();
		}
		System.out.println(i);
			
	}

}
