package DateApi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Date1 
{
	Date1(int i,int j, int kk)
	{
		super();
	}
public static void main(String[] args) 
{
	LocalDate ld1= LocalDate.of(1994,9,21);
	LocalDate ld = LocalDate.now();
	Period p = Period.between(ld1, ld);
	
	System.out.println(p );
	LocalTime lt = LocalTime.now() ;
	System.out.println(lt);
}
}
