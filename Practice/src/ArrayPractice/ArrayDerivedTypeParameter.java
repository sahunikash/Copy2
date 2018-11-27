package ArrayPractice;
class  A1
{
	int i;
	}
public class ArrayDerivedTypeParameter 
{
	public static void main(String[] args) 
	{
		A a[] = method();
		 System.out.println(a[1].i);
		
	}
	public static A[] method()
	{
		
		A[] a1= new A[8];
		a1[1].i=10;
		return a1;
	}
	

}
