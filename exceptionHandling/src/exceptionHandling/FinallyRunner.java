package exceptionHandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);

			int[] numbers = { 1, 2, 3, 4, 5 };

			int number = numbers[5];

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // code inside the finally block is always executed.
			System.out.println("Before Scanner Close");
			if (scanner != null) {
				scanner.close();
			}
		}
		System.out.println("Before Closing out main");
	}

}
