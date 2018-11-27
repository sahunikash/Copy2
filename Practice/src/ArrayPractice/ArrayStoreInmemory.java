package ArrayPractice;


class AAa
{
	int i ;
	public void m()
	{
		System.out.println(i);
	}
	
	}
public class ArrayStoreInmemory
{
	public static void main(String[] args) 
	{
		AAa [] a ;
		a= new AAa[5];
		a[1]= new AAa();
		a[1].m();
	}

}
