
class chk{
	chk()
	{
		System.out.println("class chk constructor");
	}
	static {
		System.out.println("chk SIB");
	}
	{
		System.out.println("chk IIB");
	}
	
}

public class Checking extends chk
{
static {
	System.out.println("SIB");
}

{
	System.out.println("IIB");
	}
Checking()
{
	super();
	System.out.println("Constuctor");
	}
public static void main(String[] args) {
	Checking ch = new Checking();
	Checking ch1 = new Checking();
}
}
