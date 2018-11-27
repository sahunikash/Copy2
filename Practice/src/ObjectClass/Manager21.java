package ObjectClass;
class U
{
	double d ;
	U(double k)
	{
		this.d=k;
	}
	public boolean equals(Object obj)
	{
		boolean flag =((U)obj).d==this.d;
		return flag;
	}
	}
public class Manager21 
{
public static void main(String[] args) 
{
	U u1 =  new U(20);
	U u2 = new U(20);
	System.out.println(u1.equals(u2));
}
}
