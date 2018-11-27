package ArrayPractice;

public class LeadersInArray 
{
public static void main(String[] args)
{
	findThePair(new int []{1,2,3,0,9,5,7,9,7,8});
	findThePair(new int []{110,20,30,50,7,89,7,1,2,});
	
	findThePair(new int []{13,245,34,54,73,83,9,87,0});
	findThePair(new int []{123,43,11,20,30,50,70,70,60,50});
	findThePair(new int []{123,1,24,34,555,755,80,100,100,100,1000,0});
}
public static void findThePair(int L[])
{
	int ArrayLength = L.length;
	
	int lastIndex = L[ArrayLength-1];
	//System.out.println("leaders num are" +lastIndex);
	for(int i=L.length-2;i>=0;i--)
	{
		if(L[i]>lastIndex)
		{
			System.out.println(L[i]);
		}
		lastIndex=L[i];
	}
	
	
	}

}
