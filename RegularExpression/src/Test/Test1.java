package Test;

import java.io.IOException;
class x{
	static int id=10;
	 static void sum(double x,double y){
		System.out.println("x");
	}
	 static  void sum(float x,float y){
			System.out.println("y");
		}
		static{
			System.out.println("s");
		}
}
class x1 extends x{
	static  void sum(float x,float y){
		System.out.println("y");
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		//x a=new x();
		//a.sum(5, 5);
		System.out.println(x.id);
		
		/*try{int x=10/0;
			
		}catch(Exception e){
			System.err.println(args[0]);
			System.err.println(e);
		}*/
		int x[][]=new int[3][];
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
		// TODO Auto-generated method stub
		Test1 t=new Test1();
		System.out.println(t.check());
	}
	int check(){
		try{
			System.out.println("t");
			return 1;
		}catch (Exception e){
			System.out.println("3");
			return 2;
		}finally {
			System.out.println("f");
			return 0;
		}

	}

}
