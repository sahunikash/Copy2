package ExamQuestion;

public class ReverseAString 
{
public static void main(String[] args) 
{
//	String s = "Nikash";
//	char [] c = s.toCharArray();
//	for(int i=c.length-1;i>=0;i--)
//	{
//		System.out.print(c[i]);
//	}
	
	StringBuffer b = new StringBuffer("NIKASh");
	b.reverse();
	System.out.println(b);
}
}
