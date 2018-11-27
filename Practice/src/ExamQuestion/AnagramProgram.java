package ExamQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram 
{
	static void isAnagram(String s1 ,String s2)
	{
		String S =s1.replaceAll("\\s"," ");
		String S1=s2.replaceAll("\\s"," ");
		
		boolean b =true;
		if(S.length()==S1.length())
		{


			char c[] =s1.toLowerCase().toCharArray();
			char c1[] =s2.toLowerCase().toCharArray();
			
			Arrays.sort(c);
			Arrays.sort(c1);
			
			b=Arrays.equals(c,c1);
		}
		else
		{
           b=false;
			
		}
		if(b)
		{
			System.out.println(s1+" and "+ s2+" are anagram");
		}
		else
		{
			System.out.println(s1+ "and" + s2+ " are not anagram");
		}
	}
	
public static void main(String[] args) 
{
	 isAnagram("Mother In Law", "Hitler Woman");
	 
     isAnagram("keEp", "peeK");

     isAnagram("SiLeNt CAT", "LisTen AcT");

     isAnagram("Debit Card", "Bad Credit");

     isAnagram("School MASTER", "The ClassROOM");

     isAnagram("DORMITORY", "Dirty Room");

     isAnagram("ASTRONOMERS", "NO MORE STARS");

     isAnagram("Toss", "Shot");

     isAnagram("joy", "enjoy");
 }
}
