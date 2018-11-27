package testPractice;

public class K 
{
static int i =test();
static {
	System.out.println(" from static block");
	main(null);
	System.out.println("static block end");
}
static int test()
{
	System.out.println("test begin");
	main(null);

	System.out.println("test end");
	return 10;
}
public static void main(String[] args)
{
	System.out.println("main" + i);
	}
}
