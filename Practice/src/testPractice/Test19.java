package testPractice;

public class Test19 
{
	static int i =0;
	static int  j =10;
	Test19(int a){
		System.out.println("from constructor");
	}
	Test19(String...s)
	{
		System.out.println("from var-args constructor");
	}
public static void main(String[] args) 
{
	
	Test19 t = new Test19();
	Test19 t2 = new Test19();
	
	System.out.println(i&j);
	System.out.println(i|j);
	System.out.println(i^j);
	System.out.println(5&5);
	
	
	
}
}
