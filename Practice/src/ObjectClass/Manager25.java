package ObjectClass;
class A25
{
	}
class B25 extends A25
{
	}
class C25
{
	}
public class Manager25 
{
public static void main(String[] args) 
{
	A25 a1 = new A25();
	A25 a2 = new A25();

	B25 b1 = new B25();
	C25 c1 = new C25();
	
	System.out.println(a1==a2);
	System.out.println(a1==b1);
	System.out.println(b1==a2);
	//System.out.println(a1==c1);
	//System.out.println(c1==b1);
	
	System.out.println(a1.equals(a2));
	System.out.println(b1.equals(c1));
	System.out.println(c1.equals(a1));
}
}
