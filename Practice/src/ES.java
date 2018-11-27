
class testw
{
	testw()
	{
		System.out.println("test");
	}
	
	}


public class ES extends testw
{
	static int j=1000;
	int i;
ES()
{
	super();
	System.out.println("Constuctor");
	System.out.println(i);

	
	}

static {
	System.out.println("SIB");
	System.out.println(j);
}

{
	System.out.println("SIB");
	i=100;
	}
public static void main(String[] args) 
{
	ES es = new ES();
}
}



