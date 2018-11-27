package ObjectClass;
class M
{
	int i ;
	M(int i)
	{
		this.i=i;
	}
	}
public class Manager13 {
public static void main(String[] args) 
{
	M m1 = new M(20);
	M m2 = new M(30);
	
	System.out.println(m1==m2);
	
}
}
