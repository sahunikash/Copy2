package testPractice;

public class test6 
{

	String s ;
 
	int i ;
	
	boolean b;
	public static void main(String[] args) 
	{
		test6 t = new test6();
		t.m2();
		
		System.out.println(t.s);
		
		System.out.println(t.i);
		
		System.out.println(t.b);
	}
	public void m2()
	{
		test6 t2 = new test6();
		//String s2 =t2.s;
		String s="nikash";

		System.out.println(s); 
          //int i2 = t2.i;
	  int i =30;
		System.out.println(i);
		boolean b = true;
		System.out.println(b);
				
	}

}
