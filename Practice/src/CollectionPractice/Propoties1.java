package CollectionPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Propoties1 
{
public static void main(String[] args)throws Exception
{
	Properties p = new Properties();
	FileInputStream fl = new FileInputStream("java");
	p.load(fl);
	System.out.println(p);
	String s =p.getProperty("Test.java");
	 p.setProperty("Test.java", "value");
	 
	 FileOutputStream fl1 = new FileOutputStream("java");
	 p.store(fl1, "comments");
	
	
}
}
