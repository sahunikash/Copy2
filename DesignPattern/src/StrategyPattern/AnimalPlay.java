package StrategyPattern;

public class AnimalPlay
{
	public static void main(String[] args)
	{
		Animal Spraky = new Dog();
		Animal Tweety = new Bird();
		
		System.out.println("dog"+ Spraky.tryToFly());
		System.out.println("bird" + Tweety.tryToFly());
		
		Spraky.setFlyingAbility(new ItsFly());
		System.out.println("dog"+Spraky.tryToFly());
	}

}
