import java.util.Arrays;
import java.util.List;

public class SampleExecution {

	public static void main(String[] args) {
		Integer[] spam = new Integer[] { 1, 2, 3 };
		List<Integer> lists = (List<Integer>) Arrays.asList(spam);
		for (int i : lists) {
			System.out.println(i);
		}
	}
}
