package FunctionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Banana", "Cat", "Dog", "Bat");
		printWithFPFilter(list);
	}

	private static void printList(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void printListFilter(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}

	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println("element - " + element));
	}

	private static void printWithFPFilter(List<String> list) {
		list.stream().filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println("element - " + element));
	}
}
