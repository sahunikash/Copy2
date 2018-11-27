package StringPractice;

public class ToCharArray
{
	public static void main(String[] args) 
	{
		String s = "hello welcome guys";
		
		char c[] = s.toCharArray();
		for(int i=c.length-1;i>=0;i--){
			{
			System.out.print(c[i]);	
			
			
			}
			
			
			int k [] = new int[3];
			
			k[0]=1;
			k[1]=2;
			k[2]=3;
			//k[3]=4;
			//k[4]=5;
			for(int g :k)
			{
				System.out.print(g);
				
			}
			
		}
	}

}
