package ArrayPractice;

public class TwoDimntionArray 
{
	
public static void main(String[] args) 
{
	
	int a[] ={123};
	int b[] ={456};
	int c[] ={789};
	
	
	int _2D [] [] ={a,b,c};
	
	
	for(int i =0;i<_2D.length;i++)
	{
		System.out.println(_2D[1][0]);
		for(int j =0;j<_2D[i].length;j++)
		{
			System.out.println(_2D[i][j]);
		}
		
	}
	
	
	String  S ="hello";
	String s1[] ={"hello"};
	String s2 [] = new String[s1.length];
	for(int i =0;i<s2.length;i++)
	{
		s2[i]=s1[i];
	}
	
	char [] C =S.toCharArray();
	for(int i=0;i<C.length;i++)
	{
		System.out.println(c[i]);
	}
	
}

}
