package ObjectClass;
class W
{
	int i,j;
	double k,m;
W(int i, int j, double k, double m)
{
this.i=i;
this.j=j;
this.k=k;
this.m=m;
}
public boolean equals(Object obj)
{
	W w1 = (W)obj;
	boolean flag = (i==w1.i && j==w1.j &&
			k==w1.k && w1.m==m);
	
	return flag;
	
	}
}
public class Manager23 
{
public static void main(String[] args) 
{
	W w1 = new W(12,13,12.1,12.2);
	W w2 = new W(12,13,12.1,12.2);
	W w3 = new W(12,13,12.1,12.2);
	System.out.println(w1.equals(w2));
	System.out.println(w1.equals(w3));
	
	
}
}
