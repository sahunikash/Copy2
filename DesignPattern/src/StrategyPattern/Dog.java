package StrategyPattern;

public class Dog extends Animal

{
public void digHole()
{
	System.out.println("dog a hole");
	}
public  Dog()
{
	super();
	setSound("bark");
	 // We set the Flys interface polymorphically
	// This sets the behavior as a non-flying Animal

	flyingType = new cantFly();	
}
}
