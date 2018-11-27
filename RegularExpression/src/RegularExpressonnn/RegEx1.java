package RegularExpressonnn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 
{

	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("a");
		Matcher m = p.matcher("ab");
		System.out.println(m.find());
		if(m.find())
		
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			//continue;
		}
		
	}

