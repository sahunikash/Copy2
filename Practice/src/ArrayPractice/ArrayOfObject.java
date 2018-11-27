package ArrayPractice;

public class ArrayOfObject 
{
	public void method1()
	{
		System.out.println();
	}
	public static void main(String[] args) 
	{
		ArrayOfObject [] ab = new ArrayOfObject[4];
		
		for(int i =0;i<ab.length;i++)
		{
			System.out.println(i);
			ab[i]= new ArrayOfObject();
			
		}
		try{
		ab[0].method1();
		ab[1].method1();
		ab[2].method1();
		ab[2].method1();
		ab[3].method1();
		ab[4].method1();
		//ab[5].method1();
		ab[6].method1();
		ab[8].method1();
		ab[9].method1();
		ab[10].method1();}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
