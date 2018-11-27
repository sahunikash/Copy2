package testPractice;

public class Q 
{
static int test(int i)
{
	return ++i;
	}
public static void main(String[] args)
{
	int i =3;
	i =i++;
	System.out.println(test(++i));
System.out.println(i);	
}
}
