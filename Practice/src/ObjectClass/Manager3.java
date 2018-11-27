package ObjectClass;
class C
{
	int i;
	C (int i)
	{
		this.i=i;
	}
	}
public class Manager3 
{
public static void main(String[] args) 
{
	C c1 = new C(10);
	System.out.println(c1);
	String s = c1.toString();
	String s1= "address" + c1;
	System.out.println(s);
	System.out.println(s1);
	System.out.println(c1.i);
}
}
