import java.util.Scanner;

public class FindWhetherInputNumIsValidOrNot 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner (System.in);
	System.out.println("enter phn num");
	String s = sc.next();
	
	
	if(FindWhetherInputNumIsValidOrNot.numberOrNot(s)&&s.length()==10)
	{
		
		System.out.println("u are entered correct phone num and num is "+ s);
		
	}
	else{
		System.out.println("enter invalid phone num");
	}

	
}
public static boolean numberOrNot(String s)
{
	
		Integer.parseInt(s);
		
	
	
	return true;
	}
}
