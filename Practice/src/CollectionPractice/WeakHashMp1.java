package CollectionPractice;


import java.util.WeakHashMap;

public class WeakHashMp1 
{
	public static void main(String[] args) 
	{
		WeakHashMap h = new WeakHashMap();
		Temp1 t = new Temp1();
		h.put(t,"abc");
		System.out.println(h);
		t=null;
		//System.gc();
		
		try{
			Thread.sleep(5000);
		} catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(h);
		
		
	}

}
class Temp1
{
	
public String toString()
{
	return "temp";
	}
public void finalize()
{
	System.out.println("finalize method called");
	}





}
