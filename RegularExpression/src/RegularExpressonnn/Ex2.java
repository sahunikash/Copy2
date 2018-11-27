package RegularExpressonnn;
import java.util.StringTokenizer;
import java.util.regex.*;
public class Ex2 
{
public static void main(String[] args) 
{
	StringTokenizer st  = new StringTokenizer( "abcd(hsh2wjh)","()");
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}
}
}
