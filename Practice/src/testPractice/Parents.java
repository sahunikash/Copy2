package testPractice;

public class Parents
{
int x =20;
{
	m1();
	System.out.println("from parents IIB");
	}
Parents ()
{
	System.out.println("parents Constructor");
	}
public static void main(String[] args) 
{
	Parents p = new Parents();
	p.m1();
	System.out.println(p.x);
}
public void m1()
{
	System.out.println("from method m1");
	}
int y =30;
}
class Child extends Parents 
{ 
	int x =100;
{
	m2();
	System.out.println("from child IIB");
	
	}
Child()
{
	System.out.println("from child costructor");
}
public static void main(String[] args) 
{
	Child c = new Child();
	System.out.println("from child main method");
}	
public  void m2()
{
	System.out.println(y);
	System.out.println("from m2 method");
	}
{
	System.out.println("main IIb");}
int y =600;
}







