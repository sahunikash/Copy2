package ExceptionHandling;

public class Returnn 
{
	public static void main(String[] args) 
	{
		System.out.println(ret());
	}
	public static int ret()
	
	{
		int i =0;
		try{
		 
			i=1;
			return i;
		}catch (Exception e)
		{
			System.out.println(e);
		}
		finally{
			i=3;
			return i;
		}
		
	}

}
