package ExceptionHandling;

public class ReturnValue 
{
public static void main(String[] args) 
{
	System.out.println(Rtn());
	
}

public static int Rtn()
{
	try{
		
		return 10;
	} catch(Exception E)
	{
		System.out.println(E);
		return 20;
	}
	finally
	{
		System.out.println("finnaly");
		return 40;
	}
	
	}
}
