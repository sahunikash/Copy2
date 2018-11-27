package ObjectClass;
class S
{
	double d ;
	S(double j)
	{
		this.d=j;
	}
}
public class Manager19
{
	public static void main(String[] args) 
	{
		S s1 = new S(12.4);
		S s2 = new S(12.4);
		
		S s3 = s1;
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s1);
		
		System.out.println(s1.d==s2.d);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
		
		
	}

}
