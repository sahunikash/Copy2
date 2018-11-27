package testPractice;

abstract class test29a
{
	public abstract int m1();
	public abstract void  m2();
	public abstract int m3(int i);
	
	}

class Test29 extends test29a
{
	public static void main(String[] args) {
		Test29 T= new Test29();
		T.m1();
		T.m2();
		T.m3(454);
	
}
	public int m1()
	{
		System.out.println("m1");
		return 8;
	}
	public void  m2()
	{
		System.out.println("m2");
	}
	
	public int m3(int i) {
		int k = i;
		System.out.println(k);
		return k;
	}

}
