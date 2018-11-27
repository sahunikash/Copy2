package StrategyPattern;

public interface Flys 
{
 String fly();
}
class ItsFly implements Flys 
{
	public String fly()
	{
		return "flying High";
		
	}
}
class cantFly implements Flys
{
	public String fly()
	{
		return "i cant Fly";
	}
}
