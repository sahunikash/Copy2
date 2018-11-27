package ArrayPractice;

class A 
{
int i=10;
static String s="hello";
A(String g)
{
	
	System.out.println(s);
	System.out.println(i);
	}

A()
{
}	}
public class ArrayAsParameter1 extends A
{
	
	ArrayAsParameter1()
	{
		super();
	}
public static void main(String[] args) 
{
	A[] a1 = new A[9];
	a1[1]= new ArrayAsParameter1();
	a1[6]= new A("hwwlo");
	 A.s="hellom";
	method(a1);
	System.out.println(a1[1].i);
	//System.out.println(a1[6]).s);
	
}
public static void method(A[] a1)
{
	a1[1].i=10;
	a1[6].s="hshsk";
}
}
