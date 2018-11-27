package com.interfacepractice;
interface men
{
	void eye();
	void nose();
	}
class  ImplementaionOfEye implements men
{
public  void eye()
{
	System.out.println("this is eyes");
}

public  void nose()
{
	System.out.println("this is nose");
	}
}

class esehi extends ImplementaionOfEye
{
	public  void eye()
	{
		System.out.println("this is  esehi eyes");
	}

	public  void nose()
	{
		System.out.println("this isesehi nose");
		}
	}



public class Test2 
{
public static void main(String[] args) 
{
	ImplementaionOfEye i = new esehi();
      i.eye();
	i.nose();
	 esehi e = new esehi();
	 e.eye();
	 e.nose();
	 
}
}
