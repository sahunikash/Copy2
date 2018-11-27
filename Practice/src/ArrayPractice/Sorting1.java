package ArrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting1 
{
	public static void main(String[] args) 
	{
		int i[] ={1,3,15,66,8,9,8,9,10};
		System.out.println(i[3]);
		
		
		for(int i1: i)
		{
			System.out.println(i1);
		}
		Arrays.sort(i);
		//System.out.println(i);
		for(int i1:i)
		{
			
			System.out.println(i1);
		}
		
		String s[] = {"nh-1","ad-2","aaa-3","lkh-4","khg-5"};
		for(int y =0; y<s.length;y++)
		{
			System.out.println(s[y]);
		}
		Arrays.sort(s);
		for(String s1 :s)
		{
			System.out.println(s1);
		}
		
		
	}

}
