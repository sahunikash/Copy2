package java8;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		l.add("carrom");
		l.add("badminton");
		l.add("cricket");
		l.add("football");
		System.out.println("normal for each loop");
		for(String s:l){
			System.out.println(s);
			
		}
		System.out.println("using java 8 features");
		l.forEach(game -> System.out.println(game.charAt(0)));

	}
}
