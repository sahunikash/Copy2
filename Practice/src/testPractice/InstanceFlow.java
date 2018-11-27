package testPractice;

public class InstanceFlow 
{
int x =0;
{
	m1();
	System.out.println("1st initial block");
}
InstanceFlow()
{
	System.out.println("constructor");
	}
public static void main(String[] args) 
{
	InstanceFlow If = new InstanceFlow();
	If.m1();
	System.out.println(y);
}
public void m1(){
	System.out.println("from m1 method");
	System.out.println(y);
}
{
	System.out.println("2nd initial block");
	}
static int y =20;
}
