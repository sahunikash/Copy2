package testPractice;

public class V1 
{
static {
	System.out.println("v1 static block");
}
public static void main(String[] args) {
	System.out.println("v main method");
 U.main(args);
 System.out.println("----------");
 U.main(args);
 System.out.println("U main method end");
 		
}
}
