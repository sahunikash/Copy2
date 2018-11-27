package ExamQuestion;

public class RemoveWhiteSpaces 
{
public static void main(String[] args) 
{
	String s ="hinhsga gsisjsgs gsd98s    yasd9s  jhsdoius goasid gb  shjdhs   hsodisoiaduhb kuhsd";
	
	String revome = s.replaceAll("\\s","");
	System.out.println(revome);
	
	char [] c = s.toCharArray();
	StringBuffer b = new StringBuffer();
	for(int i=0;i<c.length;i++)
	{
		if(c[i]!=' ')
		{
		b.append(c[i]);
		}
		
	}
	System.out.println(b);
	
}
}
