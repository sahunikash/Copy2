package RegularExpressonnn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx5 
{
public static void main(String[] args)
{
	Pattern p = Pattern.compile("[a-z0-9.-][a-zA-Z0-9.-]+");
	Matcher m = p.matcher(args[0]);
	if(m.find()&&m.group().equals(args[0]))
	{
		System.out.println("valid identifier");
	}
	else
	{
		System.out.println("invalid idenfier");
	}
}
}
