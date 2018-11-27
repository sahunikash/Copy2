package ArrayList1;
import java.util.*;
public class ArrayListDemo 
{
public static void main(String[] args) 
{
	ArrayList Al = new ArrayList();
	Al.add("A");
	Al.add("B");
	Al.add(10);
	System.out.println(Al);
	Al.remove(2);
	System.out.println(Al);
	Al.add("C");
	Al.add(null);
	System.out.println(Al);
}
}
