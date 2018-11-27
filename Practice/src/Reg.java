

import java.util.*;
import java.util.regex.*;
public class Reg{
public static void main(String[] args)
{
String input= new Scanner(System.in).next();
Pattern p=Pattern.compile("[0-9]{"+input.length()+"}"); //write a pattern for fully matching
Matcher m=p.matcher(input);
if(m.find())
System.out.println("It is an fully integer number");// if pattern occurs then
else
System.out.println("It is not a number");
}
}


