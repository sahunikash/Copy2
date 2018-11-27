
 class GenDemo1<T>
{
	//private static final Object T = null;
	T ob;
	GenDemo1 (T ob)
	{
		this.ob=ob;
		
	}
	public void any()
	{
		//System.out.println(100);
		System.out.println("the type of ob is" + ob.getClass().getName());
		
	}
	public T getOb()
	{
		return ob;
	}
	

}
public class GenDemo
{
	public static void main(String[] args) {
		 
		GenDemo1 <String> s1 = new GenDemo1<String>("nikash"); 
		s1.any();
		System.out.println(s1.getOb());
		GenDemo1 <Integer> i1 = new GenDemo1<Integer>(10);
		i1.any();
		System.out.println(i1.getOb());
		
	}
	


}