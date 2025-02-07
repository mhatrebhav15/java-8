package stream.easy;

import java.util.Arrays;
import java.util.List;

/**
 * Find the first element greater than 10.
 */
public class FindFirstGreaterThan10 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 12, 18, 3, 9);
		Integer first = numbers.stream().filter(n -> n > 10).findFirst().orElse(-1);
		System.out.println("First Element Greater Than 10 : " + first);
	}
}
