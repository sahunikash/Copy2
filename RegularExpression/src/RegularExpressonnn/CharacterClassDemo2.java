package RegularExpressonnn;
import java.util.regex.*;
public class CharacterClassDemo2 
{
	public static void main(String[] args) 
	{
		
	

Pattern p = Pattern.compile("a+");
Matcher m = p.matcher("aaa7baak@aaa9a");
while(m.find())
{
	System.out.println(m.start()+"---"+m.group());
}
}
}