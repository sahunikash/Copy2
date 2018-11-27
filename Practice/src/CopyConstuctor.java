
public class CopyConstuctor 
{
private int i ,j;
public CopyConstuctor(int i,int j)

{
	System.out.println("construtor");
	i=i;
	j=j;
	
	
}
public CopyConstuctor(CopyConstuctor c)
{
	System.out.println("copy consturctor");
	i=i;
	j=j;
			
	}
public String toString()
{
	return "("+i+"==="+j+")";
	}
}
