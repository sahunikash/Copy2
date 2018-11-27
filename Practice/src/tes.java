class base 
{
	static int x =100;
	static {
		x=++x + --x;
	}
	
}

public class tes extends base
{
	static {
		x=x-- + --x;
		
	}
	{
		x=x++ - ++x;
	}
public static void main(String[] args) 
{
	tes e = new tes();
	System.out.println(e.x);
	
}
}
