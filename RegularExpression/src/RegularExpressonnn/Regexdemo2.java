package RegularExpressonnn;

import java.util.regex.*;
public class Regexdemo2 
{
	public static void main(String[] args) {
		
	
Pattern p = Pattern.compile("(0|9)?[0-9]{9}");

Matcher m = p.matcher(args[0]);

if(m.find())
{
	System.out.println("number is valid"+m.group());
	}


}
}
