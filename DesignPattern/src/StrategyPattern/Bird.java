package StrategyPattern;

public class Bird extends Animal 
{
public Bird()
{
	super();
	setSound("tweet");
	flyingType = new ItsFly();
}
	
}
