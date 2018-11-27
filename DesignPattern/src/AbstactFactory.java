abstract class CPU
{
	}

class EmberCPU extends CPU
{
	}
class EnginolaCPU extends CPU
{
	}

abstract class MMU
{
	}
class EmberMMU extends MMU
{
	}
class EnginolaMMU  extends MMU
{
	}


class EmberToolkit extends AbstractFactory
{
	public CPU createCPU()
	{
		return new EmberCPU();
	}
	public MMU createMMU()
	{
		return new EmberMMU();
	}
	@Override
	public MMU ceateMMU() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}


class EnginolaToolkit extends AbstractFactory
{
	public CPU createCPU()
	{
		return new EnginolaCPU();
	}

	public MMU createMMU()
	{
		return new EnginolaMMU();
	}

	@Override
	public MMU ceateMMU() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
enum Architechture 
{
	ENGINOLA,EMBER;
	}

abstract class AbstractFactory 
{
	public static final EmberToolkit EMBER_TOOLKIT = new EmberToolkit();
	public static final EnginolaToolkit ENGINOLA_TOOLKIT = new EnginolaToolkit();
	
	
	static AbstractFactory getFactory(Architechture architechture)
	{
		AbstractFactory factory = null;	
		switch(architechture)
		{
		case ENGINOLA:
			factory=ENGINOLA_TOOLKIT;
			break;
		case EMBER :
			factory =EMBER_TOOLKIT;
			break;
		}
		return factory;
	}
	public abstract CPU createCPU();
	public abstract MMU ceateMMU();
	
	}

public class AbstactFactory 
{
public static void main(String[] args) 
{
	AbstractFactory factory = AbstractFactory.getFactory(Architechture.EMBER);
    CPU cpu = factory.createCPU();
}
}
