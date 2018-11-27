package RegularExpressonnn;
import java.util.regex.*;
public class ex1
{
	public static void main(String[] args) 
	{
		int i=0; 
	
	Pattern p = Pattern.compile("[0-9]+");
	Matcher m = p.matcher("AB56Ax2200AA1(X-90)");
	while(m.find())
	{
		i=i+Integer.parseInt(m.group());
		System.out.println(i);
	}
	
	System.err.println(i);
	}	

}
