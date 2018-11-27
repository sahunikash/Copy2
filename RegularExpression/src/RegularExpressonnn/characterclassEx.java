package RegularExpressonnn;
import java.util.regex.*;
public class characterclassEx 
{
public static void main(String[] args)
{
	Pattern p = Pattern.compile("[^a-zA-Z0-9]");
	Matcher m = p.matcher("a7b@c2");
	while (m.find())
	{
		System.out.println(m.start()+"----"+m.group());
	}
}
}
