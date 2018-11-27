package ObjectClass;
class D26
{
	int i ;
	public boolean equals(Object obj)
	{
		 D26 d26 = (D26)obj;
		return i==d26.i;
	}
	}

class E26
{
	int i;
	public boolean equals(Object obj)
	{
		E26 e26 = (E26)obj;
		
		return i==e26.i;
	}
	}
public class Manager26 
{
public static void main(String[] args)
{
	D26 d1 = new D26();
	d1.i=10;
	
	D26 d2 = new D26();
	d2.i=10;
	
	E26 e1 = new E26();
	e1.i=10;
	
	E26 e2 = new E26();
	e2.i=10;
	
	System.out.println(d1.equals(d2));
	System.out.println(e1.equals(e2));
	
	System.out.println(d1==d2);
	System.out.println(e1==e2);
	System.out.println("======");
	
	System.out.println(d1.equals(e1));
	System.out.println(e1.equals(d1));
	
	
	
	
}
}
