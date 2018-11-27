package RegularExpressonnn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNum 
{
public static void main(String[] args) throws Exception
{
	PrintWriter pw  = new PrintWriter("mobile.text");
	BufferedReader br = new BufferedReader(new FileReader("input"));
	String s = br.readLine();
	Pattern p = Pattern.compile("[7-9][0-9]{9}");
	while(s!=null)
	{
		Matcher m = p.matcher(s);
	
	while(m.find())
	{
		pw.println(m.group());
	}
	
	s=br.readLine();
	}
	pw.flush();
}
}

