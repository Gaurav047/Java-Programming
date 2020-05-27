package FPNumber;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
//		numbers.stream().forEach(element -> System.out.println(element));

		IntStream.range(1, 11).map(e -> e * e).forEach(element -> System.out.println(element));

		List.of("Apple", "Ant", "Bat", "Cat").stream().map(s -> s.toLowerCase()).forEach(e -> System.out.println(e));

		List.of("Apple", "Ant", "Bat", "Cat").stream().map(s -> s.length()).forEach(e -> System.out.println(e));

		int sum = fpSum(numbers);

		System.out.println(sum);
	}

	private static int fpSum(List<Integer> numbers) {
		int sum = numbers.stream().filter(number -> number % 2 == 1).reduce(0, (number1, number2) -> number1 + number2);
		return sum;
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

}
