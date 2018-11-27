package ObjectClass;
class G
{
	int i,j;
	public String toString()
	{
		return "i= " + i + "  j= "+ j;
	}}

public class Manager7 
{
public static void main(String[] args) 
{
	G g1=new G();
	g1.i=20;
	g1.j=78;
	System.out.println(g1);
}
}
