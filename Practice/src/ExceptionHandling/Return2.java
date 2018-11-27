package ExceptionHandling;

public class Return2
{
public static void main(String[] args)
{
	System.out.println(returnn());
}
public static String returnn()
{
	String s ="null";
	try
	{
		s="return try  ";
		return s;
	}catch(Exception E )
	{
		s=s+"return catch ";
		System.out.println(E);
		return s;
	}
	finally{
		s=s+"return from finally";
		return s;
	}
	}

}
