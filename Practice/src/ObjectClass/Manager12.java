package ObjectClass;
class L
{
	int i;
	}
public class Manager12 
{
public static void main(String[] args)
{
	L obj1 = new L();
	obj1.i=20;
	L obj2 = new L();
	obj2.i=20;
	
	System.out.println(obj1==obj2);
	System.out.println(obj1.equals(obj2));
}
}
