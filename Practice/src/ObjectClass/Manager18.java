package ObjectClass;

import org.omg.Messaging.SyncScopeHelper;

class R
{
	int i ;
	R(int i)
	{
		this.i=i;
	}
	}
public class Manager18 
{
	public static void main(String[] args) {
		
	
R r1 = new R(10);
R r2 = new R(10);
	
	System.out.println(r1==r2);
	System.out.println(r1.i==r2.i);
	System.out.println(r1.equals(r2));
	}


}
