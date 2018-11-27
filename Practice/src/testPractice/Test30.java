package testPractice;

abstract class  q1
{
	abstract  void t();
	}


class Test30 extends q1
{

	public static void main(String[] args) 
	{
		Test30 n = new Test30();
		n.t();
	}
	void t()
	{
		System.out.println("t");
	}
}
