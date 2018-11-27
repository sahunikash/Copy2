package ObjectClass;
class E
{
	int i;
	int j;
	E(int in, int jn)
	{
		this.i=in;
		this.j=jn;
	}
	}
public class Manager5
{
	public static void main(String[] args)
	{
		E e1 = new E(10,98);

		E e2 = new E(3,8);
		System.out.println(e1.i +"--"+ e1.j);
		System.out.println(e2.i +"--"+ e2.j);
		
	}

}
