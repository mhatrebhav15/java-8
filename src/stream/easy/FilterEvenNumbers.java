package stream.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Filter even numbers from a list.
 */
public class FilterEvenNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 12, 18, 3, 9);
		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers : " + evenNumbers);
	}

}
