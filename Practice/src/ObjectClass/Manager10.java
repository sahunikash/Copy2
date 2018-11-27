package ObjectClass;
class Person
{
String name;
int age;
public String toString()
{
	String s1 = "address" + super.toString();
	String s2 = "State.name= " + name +" ,age= " + age;
	return s1 +""+ s2;
	}
	}
public class Manager10 
{
public static void main(String[] args) 
{
	Person p1 = new Person();
	
	p1.name="Nikash";
	p1.age=24;
	System.out.println(p1);
}
}
