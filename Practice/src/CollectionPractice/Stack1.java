package CollectionPractice;

import java.util.Stack;

public class Stack1 
{
	public static void main(String[] args) 
	{
		Stack s=new Stack();
		s.push('a');
		s.push('v');
		s.push(1);
		s.push("Nikash");
		System.out.println(s);
		System.out.println(s.search(1));
		System.out.println(s.search('a'));
		System.out.println(s.search('Z'));
		System.out.println(s.search("Nikash"));
		
	}

}
