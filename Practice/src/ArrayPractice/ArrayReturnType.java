package ArrayPractice;

public class ArrayReturnType
{
public static void main(String[] args) 
{
	ArrayReturnType [] ar = new ArrayReturnType[8];
	ar[1]= new ArrayReturnType();
	
	
	int [] a = method();
	System.out.println(a[1]);
	System.out.println(a[2]);
	
	
}

public static int[] method()
{
	int a[] = new int[8];
	
	//ArrayReturnType ab [] = new ArrayReturnType[4];
	//ab[1]=new ArrayReturnType();
	a[1]=10;
	a[2]=30;
	
	return a;
}
}
