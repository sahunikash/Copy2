package ExamQuestion;

public class EqualityOf2Array 
{
	public static void main(String[] args) 
	{
		int [] i={1,2,3,4,5};
		int [] j={1,2,3,4,5};
		 boolean b =true;
		if(i.length==j.length)
		{
			for(int in=0;in<i.length;in++)
			{
				if(i[in]!=j[in])
				{
				b =false;
				}
			}
		}
		else
		{
			b=false;
		}
		if(b)
		{
			System.out.println("given 2 arrays are eqality");
		}
		else
		{
			System.out.println("given 2 arays are not equality");
		}
	}

}
