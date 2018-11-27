package RegularExpressonnn;

import java.util.StringTokenizer;

public class Token2 
{
public static void main(String[] args) 
{
	StringTokenizer st = new StringTokenizer("helloo mheieb hdeiek,hgeh,khsd","h");
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}
	
}
}
