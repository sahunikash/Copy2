package ArrayPractice;

public class PairsOfElementsInArray 
{
	
	int [] elements;
	int sum;
	
public static void main(String[] args) 
{
	PairsOfElementsInArray pi = new PairsOfElementsInArray();
	pi.findThePair(new int []{1,2,3,0,9,5,7,8},10);
	pi.findThePair(new int []{110,20,30,50,7,89,7,1,2,35},100);
	
	pi.findThePair(new int []{13,245,34,54,73,83,9,87,0},120);
	pi.findThePair(new int []{123,43,11,20,30,50,70,80},210);
	pi.findThePair(new int []{123,1,24,34,555,755,80,100,100,100,1000,0},1000);
	
}

public void findThePair(int elements[],int sum)
{
	this.elements=elements;
	this.sum=sum;
	for(int i =0;i<elements.length;i++)
	{
		for(int j =i+1;j<elements.length;j++)
		{
			if(elements[i]+elements[j]==sum)
			{
				System.out.println("two elements  "+elements[i]+ "  and "+ elements[j]+ " whose sum is  " + sum);
			}
			else{
				System.out.println("two elements  "+elements[i]+"  and  "+elements[j]+ "  whose sum is not  " + sum);
			}
			
		}
	}
	
	
	
}

}
