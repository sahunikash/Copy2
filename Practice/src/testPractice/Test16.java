package testPractice;

public class Test16 
{
public static void main(String[] args) {
	String s = new String("Nikash");
	String s1 = new String("nikash");
	String s3 = new String ("Nikash");
	String s4=s;
	System.out.println("1->"+ s==s1);
	System.out.println("2->"+ s==s3);
	System.out.println("3->"+ s1==s3);
	System.out.println("4->"+ s==s4);
	System.out.println("5->"+s.equals(s1));
	System.out.println("6->"+s.equals(s3));
	System.out.println("7->"+s1.equals(s3));
	System.out.println("8->"+s3.equals(s4));
	System.out.println(s.equals(s4));
}
}
