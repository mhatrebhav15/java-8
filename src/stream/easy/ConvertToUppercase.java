package stream.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Convert a list of strings to uppercase.
 */
public class ConvertToUppercase {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Anna", "Mike");
		List<String> collect = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Uppercase List : " + collect);
	}

}
