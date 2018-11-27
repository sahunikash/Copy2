package RegularExpressonnn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("a");
		
		
		Matcher m  = p.matcher("basutweaakjhysfbaadjos,h"); 
		while(m.find())
		{
		//System.out.println(m.start());
		//System.out.println(m.end());
		System.out.println(m.group());
		}
	}

}
