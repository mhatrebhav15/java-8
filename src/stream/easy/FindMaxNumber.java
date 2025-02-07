package stream.easy;

import java.util.Arrays;
import java.util.List;

/**
 * Find the maximum number in a list.
 */
public class FindMaxNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4, 9, 1, 22, 15);
		Integer max = numbers.stream().max(Integer::compareTo).orElse(-1);
		System.out.println("Maximum Number : " + max);
	}

}
