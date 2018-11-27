
public class Clone1 implements Cloneable

{
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
		
	}
	
	String name = "Nikash";
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Clone1 c = new Clone1();
		System.out.println(c.name);
		Clone1 c2 = (Clone1)c.clone();
		System.out.println(c2.name);
		
	}

}
