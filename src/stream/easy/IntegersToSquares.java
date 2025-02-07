package stream.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Convert a list of integers to their squares.
 */
public class IntegersToSquares {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
		System.out.println("Integers To Squares : " + list);
	}

}
