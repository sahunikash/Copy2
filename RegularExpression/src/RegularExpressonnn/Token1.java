package RegularExpressonnn;

import java.util.StringTokenizer;

public class Token1 
{
	public static void main(String[] args) 
	{
		StringTokenizer st = new StringTokenizer("my najnm is khan and i m not a terrorist");
		while(st.hasMoreTokens())
		{
			String s =st.nextToken();
			System.out.println(s);
		}
	}
}
