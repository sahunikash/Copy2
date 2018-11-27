package testPractice;

public class Test5
{
int x =0;
public static void main(String[] args) 
{ 
	Test5 t = new Test5();
    int y=t.x;
    System.out.println(y);
    t.x=30;
    t.m1();
} 
    public void m1()
    {
    	Test5 t1 = new Test5();
    			int k=t1.x;
    		 k=20;
    	System.out.println(k);
    }
}

