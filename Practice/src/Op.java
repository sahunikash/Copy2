
public class Op 
{
	static int i=-1;
	public void inc()
	{
		++i;
	}
	public void dec()
	{
		--i;
	}
	
	public static void main(String[] args) {
		
	Op op = new Op();
	op.dec();
	op.inc();
	Op op1 = new Op();
	System.out.println(op1.i);



}
}
