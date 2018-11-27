package RegularExpressonnn;

import java.util.regex.Pattern;

public class Split1 
{
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("\\.");
		String [] s = p.split("nikashsahu .nikhsa .sah.u .bibibibni nnhir");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		for(String s2 :s){
		System.out.println(s2);
		}
	}

}
