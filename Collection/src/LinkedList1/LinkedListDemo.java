package LinkedList1;
import java.util.*;
public class LinkedListDemo 
{
	public static void main(String[] args) {
		
	 LinkedList ll = new LinkedList();
 ll.add("durge");
 ll.add(30);
 System.out.println(ll);
 ll.set(0,"software");
 System.out.println(ll);
 ll.add(0,"venky");
 System.out.println(ll);
 ll.removeLast();
 System.out.println(ll);
 ll.addFirst("ccc");
 System.out.println(ll);
 ll.removeLast();
 System.out.println(ll);
}
}