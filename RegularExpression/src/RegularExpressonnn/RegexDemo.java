package RegularExpressonnn;

import java.util.regex.*;
public class RegexDemo
{
public static void main(String[] args) 
{ 
	int count =0;
	Pattern p = Pattern.compile("ab");
	Matcher m = p.matcher("abacbaabnbuhgababababaiababa");
	while(m.find())
	{
		count ++;
		System.out.println(m.start() +".............." + m.start());
	}
	System.out.println("the num of occurance" + count);
}
}
