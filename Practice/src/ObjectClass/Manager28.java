package ObjectClass;

public class Manager28 
{
	private String s;
	Manager28 (String s)
	{
		this.s=s;
		
	}
public static void main(String[] args) 
{
Manager28 m1 = new Manager28("123");
Manager28 m2 = new Manager28("123");
	
String s ="hello";
String s2="hello";
System.out.println(m1.equals(m2));
	System.out.println(m1==m2);
	
	System.out.println(s.equals(s2));
	System.out.println(s==s2);
	
}
}
