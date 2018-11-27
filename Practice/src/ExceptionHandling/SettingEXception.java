package ExceptionHandling;

public class SettingEXception
{
	public static void main(String[] args) 
	{
		
		try{
			NumberFormatException x = new NumberFormatException("Exception created");
			
			x.initCause(new NullPointerException("This is Actual couse of the exception"));
			throw x;
			
			
		}catch(Exception x)
		{
			System.out.println(x);
			System.out.println(x.getCause());
		}
	}

}
