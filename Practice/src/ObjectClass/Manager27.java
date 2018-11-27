package ObjectClass;
class F27
{
int i;
public boolean equals(Object obj)
{
if(!(obj instanceof F27))
{
	return false;
}
return i==((F27)obj).i;
}
}

class F28
{
int i ;
public boolean equals(Object obj)
{
	if(!(obj instanceof F28))
	{
		return false;
	}
	return i==((F28)obj).i;
	}
}


public class Manager27 
{
public static void main(String[] args)
{
	F27 f1 = new F27();
	f1.i=10;
	F27 f2 = new F27();
	f2.i=10;
	F28 f3 = new F28();
	f2.i=10;
	F28 f4 = new F28();
	f4.i=10;
	
	System.out.println(f1.equals(f2));
	System.out.println(f2.equals(f3));
	System.out.println(f3.equals(f4));
	System.out.println(f1.equals(f3));
	System.out.println(f1.equals(f4));
	System.out.println(f2.equals(f4));
	
	
	
	
}
}
