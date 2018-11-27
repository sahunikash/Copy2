package testPractice;

public class Y 
{
static int test1()
{
	System.out.println("from test1");
	
	
return 15;
}
static int test2()
{
	System.out.println("from test2");
	return 10;
	}
public static void main(String[] args) 
{
test1();
System.out.println(test1());
System.out.println(test1() + test2());
test2();
System.out.println(test2());
}
}
