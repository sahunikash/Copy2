package ArrayPractice;

public class Test4 
{

	 public static void main(String[] args)
	 {
	  int[] ar = {34,23,67,45,23};
	  Test4 t = new Test4();
	  t.max(ar);
	 }
	 void max(int[] a) {
		  int max = a[0];
		  System.out.println(max);
		  for(int i = 0; i< a.length; i++) {
		   if(max < a[i]) {
		    max = a[i];
		   }
		  }
		  System.out.print("Max = "+max);
		 }
	 
	}


