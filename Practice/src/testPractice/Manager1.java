package testPractice;
class A3
{ 
	public void test1(int i)
	{
		System.out.println(i);
	}
	
 
	
public void test1()

{
	System.out.println("from test");
	}
class B extends A3
{
public void test2(){
	System.out.println();
}
}
class Manager1 
{
public void main(String[] args)
{
	
	B b1 = new B();
	b1.test1();
	}
}
}
