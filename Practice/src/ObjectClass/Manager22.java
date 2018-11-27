package ObjectClass;
class V
{
	int i;
	int j;
	V(int k, int k1)
	{
		this.i=k;
		this.j=k1;
	}
	public boolean equals(Object obj)
	{
		V v1 = (V)obj;
		boolean galg= (i==v1.i&&j==v1.j);
		return galg;
	}
	
	}
public class Manager22 
{
public static void main(String[] args)
{
	V v1 = new V(20,21);
	V v2 = new V(20,21);
	
	System.out.println(v1.equals(v2));
	System.out.println(v1==v2);
	
	
	
}
}
