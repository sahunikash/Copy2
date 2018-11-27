package testPractice;

public class Test10 
{
	int x=0;
	static int y=10;
public static void main(String[] args) 
{
	Test10 t = new Test10();
	t.x=10;
	System.out.println(t.x +"----"+y);
	Test10 t1 = new Test10();
	t1.x=20;
	System.out.println(t1.x+"----" +y);
	
}
}
