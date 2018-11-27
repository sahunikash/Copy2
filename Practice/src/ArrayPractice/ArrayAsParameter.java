package ArrayPractice;

public class ArrayAsParameter
{
public static void main(String[] args) 
{
	String s[] = new String[5];
	s[1]="nikash";
	s[2]="nikash2";
	s[4]="hello";
	System.out.println(s[1]);
	System.out.println(s[2]);
	System.out.println(s[4]);
	method(s);
	System.out.println(s[1]);
	System.out.println(s[2]);
	System.out.println(s[4]);


}
public static void method(String s[])
{
	s[1]="changed";
	s[2]="S2 changed";
	s[4]= "s4 change";
	}
}
