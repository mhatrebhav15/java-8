package stream.medium;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Program to find distinct characters in a string.
 */
public class DistinctCharacters {

	public static List<Character> getDistinctCharacters(String str) {
		return str.chars() // Convert the string into an IntStream
				.mapToObj(c -> (char) c) // Convert each int value to a Character
				.distinct() // Remove duplicate characters
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		String input = "Java 8 Stream API";
		List<Character> distinctChars = getDistinctCharacters(input);
		System.out.println("Distinct characters : " + distinctChars);
	}

}
