package ArrayPractice;

public class Test8 
{
public static void main(String[] args) 
{
	int i []= {10,20,6,5,9,7,8};
	int min = i[0];
	
	for(int a=0;a<i.length;a++)
	{
		if(min>i[a])
		{
			min=i[a];
		}
		else {
			System.out.println("else");
		}
	}
	System.out.println(min+" :this is the min value");
}
}
