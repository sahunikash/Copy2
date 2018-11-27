
public final class ImmutableClass 
{
private final int i;
public ImmutableClass(int i)
{
	//System.out.println(i);
	this.i=i;
	//System.out.println(i);
	}
public int get(int i)
{
	System.out.println(i);
	return this.i;
	
	
	}
public static void main(String[] args) 
{
	ImmutableClass ic = new ImmutableClass(10);
	System.out.println(ic);
	System.out.println(ic.i);
}
}
