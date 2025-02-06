package stream;

/**
 * 
 * Count the number of vowels in a given string
 * 
 */
public class VowelCount {

	public static long countVowels(String str) {
		return str.chars() // Convert the string into an IntStream
				.mapToObj(c -> (char) c) // Convert each character from int to Character
				.filter(c -> "AEIOUaeiou".indexOf(c) != -1) // Filter out vowels
				.count(); // Count the remaining vowels
	}

	public static void main(String[] args) {
		String input = "I am going to be King of the Pirates";
		long vowelCount = countVowels(input);
		System.out.println("Number of vowels: " + vowelCount);
	}

}
