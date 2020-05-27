package FPNumber;

import java.util.List;

public class MethodReferencesRunner {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Elephant").stream().map(String::length).forEach(MethodReferencesRunner::print);
	}

}
