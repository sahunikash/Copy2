package LinkedList1;

import java.util.Arrays;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 4, 22, 18, 10, 4 };

		Arrays.sort(array);
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		do {
			if (sum % 2 == 0) {
				break;
			}
			sum--;
		} while (sum > 0);

		System.out.println(sum/2);

	}

}
