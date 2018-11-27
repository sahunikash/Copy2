package ExceptionHandling;
import java.util.Scanner;


class any extends ArithmeticException
{
	public String  toString()
	{
		return "u Have not suffient Balance";
	}
	}

public class UserDefinerException 
{
	public static void main(String[] args) 
	{
		int balance =1000;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter withdraw Money");
		int i =sc.nextInt();
		if(balance<i)
		{
			try{
				throw new any();
			}catch(Exception E){
				System.out.println(E);
				
			}
			
			}else{System.out.println("withdraw succecafull");
		}
		
	}

}
