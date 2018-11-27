package ArrayPractice;

public class Test2 
{
public static void main(String [] args)
{
	int i[] = new int[3];
	i[0]=10;
	i[1]=10;
	i[2]=20;
	//i[3]=30;
	int total =0;
	for(int j =0;j<i.length;j++)
	{
		total=total+i[j];
	}
	System.out.println(total);
	
	}
}
