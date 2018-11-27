package StringPractice;

public class GetChars
{
public static void main(String[] args) 
{
	String s = "hello my freinds ";
	char [] c = new char[10];
	
	s.getChars(5,9,c,0);
	for(char c2 :c)
	{
		System.out.println(c);
	}
}
}
