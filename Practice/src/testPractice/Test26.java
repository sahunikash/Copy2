package testPractice;

public class Test26 
{
public static void main(String[] args) 
{
	String s = "abcd";
	String s1="";
	for(int i=s.length()-1;i>=0;i--)
	{
		s1=s1+s.charAt(i);
	}
	System.out.println(s1);
}
}
